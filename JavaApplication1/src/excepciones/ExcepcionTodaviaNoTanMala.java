/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class ExcepcionTodaviaNoTanMala {
    public static void main(String[] args) {
        //declaramos un arreglo de enteros
        int x[]={1,34,6,8};  //si se sabe el numero e indicas valores fijos
        
        float []y=new float[4];//forma implicita porque especifica el tamaña no se sabe el numero
        //los inicializamos
        float z;
        
        
        // todos los arreglos son tratados por el compilador como objetos
        
        
        A objeto=new A();
        System.out.println(objeto.m);
        System.out.println(y[2]); //TRATADO COMO OBJETO
        //System.out.println(Z); LO TRATA COMO PRIMITIVO POR NO TENER VALOR
        //VAMOS A ITERAR EL ARREGLO X
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
            
        }
        //el ciclo for x pero mejorado
        for(int w:x){
            System.out.println(w);
        }
    }
}
class A{
    float m;
}
//g