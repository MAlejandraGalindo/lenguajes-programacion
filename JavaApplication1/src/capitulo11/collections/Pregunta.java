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
import SolucionExamen.OPCION;
import java.util.*;  //clase moderada
public class Pregunta {
        private String titulo;
       private ArrayList <Opcion> opciones; 

    public Pregunta(String titulo, ArrayList<Opcion> opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    public Pregunta(String capital_de_rusia, OPCION[] opciones) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList <Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList <Opcion> opciones) {
        this.opciones = opciones;
    }
}
