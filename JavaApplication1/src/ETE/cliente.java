/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ETE;

/**
 *
 * @author T-101
 */
public class cliente {
    String nombre;
    String Apaterno;
    int edad;
    float sueldo;
    Direccion direccion;

    public cliente(String nombre, String Apaterno, int edad, float sueldo, Direccion direccion) {
        this.nombre = nombre;
        this.Apaterno = Apaterno;
        this.edad = edad;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    void setnombre(String ana) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDireccion(Direccion d1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
