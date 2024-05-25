/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebapaneles2;

/**
 *
 * @author Adrian
 */

public class PruebaPaneles2 {

    public static void main(String[] args) {
        fran1 frame = new fran1();
        panel1 panel1 = new panel1(frame);
        panel2 panel2 = new panel2(frame);

        frame.setVisible(true);
        frame.setPanel(panel1);
        frame.pack();
    }
}

