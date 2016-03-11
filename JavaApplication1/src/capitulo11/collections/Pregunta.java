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
import java.util.*;  //clase moderada
public class Pregunta {
        private String titulo;
       private ArrayList <Opcion> opciones; 

    public Pregunta(String titulo, ArrayList<Opcion> opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
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
