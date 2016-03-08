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
public class PREGUNTA {
    String titulo;

    public PREGUNTA(String titulo, OPCION[] opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }
    OPCION opciones[];

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public OPCION[] getOpciones() {
        return opciones;
    }

    public void setOpciones(OPCION[] opciones) {
        this.opciones = opciones;
    }
    
    
}
