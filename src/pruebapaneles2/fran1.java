/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebapaneles2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fran1 extends javax.swing.JFrame {

    private JPanel currentPanel;

    public fran1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = mipantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;

        setSize(anchoPantalla / 2, alturaPantalla / 2);
        setLocation(anchoPantalla / 4, alturaPantalla / 4);
        setResizable(true);
        setTitle("Menu principal de la NASA");
        setLayout(new BorderLayout());
    }

    public void setPanel(JPanel panel) {
        if (currentPanel != null) {
            getContentPane().remove(currentPanel);
        }
        currentPanel = panel;
        getContentPane().add(currentPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
}

