
import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author black
 */
public class HiloSemaforo2 extends Thread {

    LienzoCanvas sem = new LienzoCanvas();
    Ventana puntero;
    boolean ejecutar = true;
    int contador = 0;
    Color amaOn = new Color(255, 232, 0);
    Color rojOn = new Color(255, 0, 0);
    Color verOn = new Color(104, 255, 0);
    Color verdeOff = new Color(0, 103, 22);
    Color amaOff = new Color(149, 157, 20);
    Color rojOff = new Color(140, 24, 22);

    public HiloSemaforo2(Ventana p) {
        puntero = p;
    }

    public void alternarVerde() {
        puntero.obj.sem[1].verdeOff = verOn;
        puntero.obj.sem[1].amaOff = amaOff;
        puntero.obj.sem[1].rojOff = rojOff;
        puntero.obj.repaint();
    }

    public void alternarAmarillo() {
        puntero.obj.sem[1].verdeOff = verdeOff;
        puntero.obj.sem[1].amaOff = amaOn;
        puntero.obj.sem[1].rojOff = rojOff;
        puntero.obj.repaint();
    }

    public void alternarRojo() {
        puntero.obj.sem[1].verdeOff = verdeOff;
        puntero.obj.sem[1].amaOff = amaOff;
        puntero.obj.sem[1].rojOff = rojOn;
        puntero.obj.repaint();
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        while (ejecutar) {
            try {
                puntero.semaforo2 = false;
                alternarRojo();
                sleep(25000);
                puntero.semaforo2 = true;
                alternarVerde();
                sleep(25000);
                puntero.semaforo2 = false;
                alternarAmarillo();
                sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloSemaforo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
