/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * a estas excepciones se les conoce como unchecked exception
 * @author T-101
 */
public class excepcionesQueNoMePreocupo {
    public static void main(String[] args){
        //una excepcion y sus trampas
        int a=2;
        int b=0;
        System.out.println("Antes de la excepcion");
        int z=a/b;
        System.out.println("El valor de la divicion es:"+z);
    }
}
