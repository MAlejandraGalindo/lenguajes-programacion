/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;

/**
 *
 * @author T-101
 */
import java.util.*;
public class GeneradorPreguntas {
    
    public   GeneradorPreguntas(){
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
            //vamos a crear una sola pregunta con tres opciones
Opcion o1=new Opcion("moscu", true);
Opcion o2=new Opcion("Florencia", false);
Opcion o3=new Opcion("paris", false);

ArrayList<Opcion>opciones=new ArrayList<Opcion>();
opciones.add(o1);
opciones.add(o2);
opciones.add(o3);
Pregunta p1=new Pregunta ("Capital de rusia",opciones);
ArrayList<Pregunta>preguntas=new ArrayList<Pregunta>();
preguntas.add(p1);

return preguntas;
        }
    
}


