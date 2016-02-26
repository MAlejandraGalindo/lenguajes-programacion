/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarThreadLaMejor {
    //Esta es la forma no. 3 es la mejor
    
    public static void main(String[] args) {
        Thread t2=new Thread(new Runnable(){  //EL NEW VA HACER UN OBJETO DE MANERA ANONIMA
            //DE QUI EMPIEZA LA REFERENCIA ANONIMA

            @Override
            public void run() { 
                //SE DEJA SOLO EL RUN
                int x=1;
            for(int i=0; i<=30; i++){
                System.out.println(x++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            }
              //TERMINA LA REFERENCIA ANONIMA
            }); 
          Thread t3=new Thread(new Runnable(){  //EL NEW VA HACER UN OBJETO DE MANERA ANONIMA
            //DE QUI EMPIEZA LA REFERENCIA ANONIMA

            @Override
            public void run() {    //SE DEJA SOLO EL RUN
                while (true){
                System.out.println("tODOS VAMOS A MORIR");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            }
          
                  
              
        });
        t2.start();
        t3.start();
    }
}
