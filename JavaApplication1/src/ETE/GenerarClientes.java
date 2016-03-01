/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ETE;

//dentro del cuerpo del metodo
 //
public class GenerarClientes {
    
public static cliente[] obtenerClientes(){
   

    cliente clientes[]=new cliente[3];
    clientes[0]=new cliente("ana","lopez",20,2000, new Direccion("sur 10",20,"ecatepec"));
    clientes[1]=new cliente();
    clientes[2]=new cliente();
    
    
    
    return clientes;
}

   
    
}
    

