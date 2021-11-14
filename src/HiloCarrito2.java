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
public class HiloCarrito2 extends Thread {

    Ventana puntero;
    boolean ejecutar = true;

    public HiloCarrito2(Ventana p) {
        puntero = p;
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        while (ejecutar) {
            try {
                if (puntero.semaforo1 == false && puntero.obj.PosXC[1] == 360) {
                    puntero.obj.PosXC[1] = 360;
                } else {
                    if (puntero.obj.PosXC[1] == -50) {
                        puntero.obj.PosXC[1] = 560;
                    }
                    puntero.obj.PosXC[1] -=10;
                }
                sleep(200);
                puntero.obj.repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloCarrito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
