


import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rip.Torres! ^-^
 */
public class LienzoCanvas extends Canvas {
    int[] PosXC = {10, 560, 318, 264};
    int[] PosYC = {160, 220, 10, 340};
    Semaforos[] sem = new Semaforos[2];
    Carro[] carrito = new Carro[4];

    public LienzoCanvas() {
        for (int i = 0; i < sem.length; i++) {
            sem[i] = new Semaforos();
        }
        for (int i = 0; i < carrito.length; i++) {
            carrito[i] = new Carro();
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.setBackground(Color.WHITE);

        //CALLES
        g.setColor(Color.GRAY);
        g.fillRect(0, 155, 600, 100);
        g.fillRect(255, 0, 100, 400);
        g.setColor(Color.white);
        //BLANCAS HORIZONTALES
        for (int i = 10; i < 570; i += 40) {
            g.fillRect(i, 200, 20, 5);
        }
        //BLANCAS VERTICALES
        for (int i = 10; i < 410; i += 40) {
            g.fillRect(300, i, 5, 20);
        }

        //Semaforo
        g.setColor(Color.darkGray);
        sem[0].dibujarSemaforo(g, 188, 5);
        g.setColor(Color.darkGray);
        sem[1].dibujarSemaforo(g, 362, 262);
        carrito[0].dibujarCarro(g, PosXC[0], PosYC[0], Color.RED, Color.WHITE, Color.BLACK, 'H');
        carrito[1].dibujarCarro(g, PosXC[1], PosYC[1], Color.BLUE, Color.WHITE, Color.BLACK, 'H');
        carrito[2].dibujarCarro(g, PosXC[2], PosYC[2], Color.GREEN, Color.WHITE, Color.BLACK, 'V');
        carrito[3].dibujarCarro(g, PosXC[3], PosYC[3], Color.PINK, Color.WHITE, Color.BLACK, 'V');

    }
}
