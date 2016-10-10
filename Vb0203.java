/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vb0203;

import javax.swing.*;

/**
 *
 * @author ROC
 */
public class Vb0203 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame= new Vb0203();
        frame.setSize ( 200, 200);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        frame.setTitle( "Voorbeeld 0203");
        JPanel paneel = new JPanel();
        frame.setContentPane( paneel);
        frame.setVisible( true );
    }
}
