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
import java.io.*;
import java.util.ArrayList;
public class PersistenciaUsuario {
    ArrayList<Usuario>usuarios;
  
    //clase logica que se puede guardar en una base de datos y se puede transferir en http
    //si te piden los metodos para una base de datos seran get, post, put y delate.
    //esta no se transfiere por http esta solo ayudara a que se tranfiera otra...

    public PersistenciaUsuario() {
        usuarios=new ArrayList<>();
    }
  
    //Primero ponemos el metodo de buscar todos
    ArrayList<Usuario> buscarTodos()throws Exception{
        //paso 1: Leemos el archivo donde estan guardados el arrayList
        File f=new File("Archivaldo,.raton");//puede o no llevar extencion
        //PASO 2: Leemos el contenido
        FileInputStream fis=new FileInputStream(f);
        //Descomprimimos el contenido
        ObjectInputStream ois=new ObjectInputStream(fis);
        usuarios=(ArrayList<Usuario>) ois.readObject(); //se le tien que haver el cast
        return usuarios;
    }
    public void guardar(Usuario u)throws Exception{ //arquitectura para las bases de datos
        File f=new File("archivaldo.raton");
        if(f.exists())usuarios=buscarTodos();  //guardar registro por registro y no se boorren los anteriores
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        usuarios.add(u);
        oos.writeObject(usuarios);
    }
}
