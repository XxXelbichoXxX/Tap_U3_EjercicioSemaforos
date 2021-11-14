
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
public class HiloCarrito3 extends Thread {

    Ventana puntero;
    boolean ejecutar = true;

    public HiloCarrito3(Ventana p) {
        puntero = p;
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        while (ejecutar) {
            try {
                if (puntero.semaforo2 == false && puntero.obj.PosYC[2] == 100) {
                    puntero.obj.PosYC[2] = 100;
                } else {
                    if (puntero.obj.PosYC[2] == 420) {
                        puntero.obj.PosYC[2] = -50;
                    }
                    puntero.obj.PosYC[2] += 10;
                }
                sleep(200);
                puntero.obj.repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
