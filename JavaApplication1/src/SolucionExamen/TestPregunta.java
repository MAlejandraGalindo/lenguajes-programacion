/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SolucionExamen;

/**
 *
 * @author T-101
 */
public class TestPregunta {
    public static void main(String[] args) throws Exception{
        OPCION op1=new OPCION ("Paris",false);
        OPCION op2=new OPCION ("Florencia",false);
        OPCION op3=new OPCION ("Londres",false);
        OPCION op4=new OPCION ("Moscu",true);
        OPCION opciones[]=new OPCION[4];
        opciones[0]=op1;
        opciones[1]=op2;
        opciones[2]=op3;
        opciones[3]=op4;
        ValidarOpcion validar=new ValidarOpcion();
        validar.validar(opciones);
        Pregunta p=new Pregunta("capital de rusia",opciones);
        
    }
    
}
