
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author black
 */
public class Semaforos{
    int tamX = 60;
    int tamY = 120;
    Color verdeOff = new Color(0, 103, 22);
    Color amaOff = new Color(149, 157, 20);
    Color rojOff = new Color(140, 24, 22);
    public void dibujarSemaforo(Graphics g, int posX, int posY){
        g.fillRect(posX, posY, tamX, tamY);
        g.setColor(verdeOff);
        g.fillOval(posX+13, posY+3, 30, 30);
        g.setColor(amaOff);
        g.fillOval(posX+13, posY+38, 30, 30);
        g.setColor(rojOff);
        g.fillOval(posX+13, posY+76, 30, 30);
    }
}