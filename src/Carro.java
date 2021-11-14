
import java.awt.Color;
import java.awt.Graphics;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author black
 */
public class Carro {
    public void dibujarCarro(Graphics g, int posX, int posY, Color colorCarro, Color colorVidrio, Color colorLlantas, char or){
        if(or == 'H'){
            //CUERPO DEL CARRO
            g.setColor(colorCarro);
            g.fillRect(posX, posY, 50, 30);
            //VIDRIOS
            g.setColor(colorVidrio);
            g.fillRect(posX+5, posY+5, 30, 20);
            //CUERPO DEL TECHO
            g.setColor(colorCarro);
            g.fillRect(posX+8, posY, 20, 30);
            //LLANTAS
            g.setColor(colorLlantas);
            g.fillRect(posX+2, posY-2, 10, 2);
            g.fillRect(posX+32, posY-2, 10, 2);
            g.fillRect(posX+2, posY+30, 10, 2);
            g.fillRect(posX+32, posY+30, 10, 2);
        }else if(or == 'V'){
            //CUERPO DEL CARRO
            g.setColor(colorCarro);
            g.fillRect(posX, posY, 30, 50);
            //VIDRIOS
            g.setColor(colorVidrio);
            g.fillRect(posX+5, posY+5, 20, 30);
            //CUERPO DEL TECHO
            g.setColor(colorCarro);
            g.fillRect(posX, posY+3, 30, 20);
            //LLANTAS
            g.setColor(colorLlantas);
            g.fillRect(posX-2, posY+3, 2, 10);
            g.fillRect(posX+30, posY+3, 2, 10);
            g.fillRect(posX-2, posY+31, 2, 10);
            g.fillRect(posX+30, posY+31, 2, 10);
        }else{
            showMessageDialog(null, "Estas ingresando una orientación no valida para algun carrito");
        }
    } 
}
