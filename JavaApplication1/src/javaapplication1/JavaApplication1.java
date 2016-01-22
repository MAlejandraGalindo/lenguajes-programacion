/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JFrame;


public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Dame mi punto");
        /*
        ejercicio no. 1 crearuna ventana y personalizar el titulo 
        con un constructor
        
        */
        JFrame ventana=new JFrame("Hola mundo");
               ventana.setSize(350, 350);
               ventana.setVisible(true);
    }
    
}
