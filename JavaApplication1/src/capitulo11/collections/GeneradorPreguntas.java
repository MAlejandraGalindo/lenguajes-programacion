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
import javax.swing.JRadioButton;
public class GeneradorPreguntas {
    

    public static ArrayList<Pregunta> obtenerTodasLasPreguntas(){
       
            //vamos a crear una sola pregunta con tres opciones
Opcion o1=new Opcion("moscu", true);
Opcion o2=new Opcion("Florencia", false);
Opcion o3=new Opcion("paris", false);
Opcion o4=new Opcion("Inglaterra",false);

    Opcion op1=new Opcion("tokio",false);
    Opcion op2=new Opcion("begjin",true);
    Opcion op3=new Opcion("seul",false);
    Opcion op4=new Opcion("pyonjiang",false);
    

ArrayList<Opcion>opciones=new ArrayList<Opcion>();
opciones.add(o1);
opciones.add(o2);
opciones.add(o3);
opciones.add(o4);
Pregunta p1=new Pregunta ("Capital de rusia",opciones);
ArrayList<Pregunta>preguntas=new ArrayList<Pregunta>();
preguntas.add(p1);

 ArrayList<Opcion>opciones2=new ArrayList<Opcion>();
opciones2.add(op1);
opciones2.add(op2);
opciones2.add(op3);
opciones2.add(op4);
Pregunta p2=new Pregunta ("Capital de china",opciones2);

preguntas.add(p2);
    
    
      


return preguntas;
        }
    public static boolean checarRespuesta(Pregunta p, JRadioButton[] radios){
boolean respuesta=false;
String seleccion="";
for(JRadioButton radio:radios){
    if(radio.isSelected()){
        seleccion=radio.getText();
    }
    }
for(Opcion o:p.getOpciones()){
    if(o.isEstatus()){ 
        if(o.getTitulo().equals(seleccion))respuesta=true;
    }
}
return respuesta;

}
    


}

