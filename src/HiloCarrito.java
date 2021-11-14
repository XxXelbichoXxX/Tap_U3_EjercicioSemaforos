
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
public class HiloCarrito extends Thread {

    Ventana puntero;
    boolean ejecutar = true;
    boolean despausado = true;
    HiloSemaforo f = new HiloSemaforo(puntero);

    public HiloCarrito(Ventana p) {
        puntero = p;
    }

    public void pausar() {
        despausado = !despausado;
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        while (ejecutar) {
            try {
                if (puntero.semaforo1 == false && puntero.obj.PosXC[0] == 200) {
                    puntero.obj.PosXC[0] = 200;
                } else {
                    if (puntero.obj.PosXC[0] == 620) {
                        puntero.obj.PosXC[0] = -50;
                    }
                    puntero.obj.PosXC[0] += 10;
                }
                sleep(200);
                puntero.obj.repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
