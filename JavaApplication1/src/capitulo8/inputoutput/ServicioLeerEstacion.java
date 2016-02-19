/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.inputoutput;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author T-101
 */
public class ServicioLeerEstacion {

    
    public static String generarValor(String etiqueta)throws Exception{
       String valor="sin valor";

        URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        url.openConnection();
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
            InputStream input=con.getInputStream();
            InputStreamReader isr=new InputStreamReader(input);
            BufferedReader reader=new BufferedReader(isr);
           
            String lineaActual="no ha leido nada";
              boolean encontrado=false;
              int miLinea=0;
            while((lineaActual=reader.readLine())!=null){
                if(encontrado &&miLinea<=0){
                    //VAMOS A DESPEDAZAR LA LINEA
                    int indice=lineaActual.indexOf(">");
                   int indice2= lineaActual.indexOf("</");
                           
                            
                    String temActual=lineaActual.substring(indice+1,indice2);
                    valor=temActual;
                    System.out.println(temActual);
                    miLinea++;
                }
                if (lineaActual.contains(etiqueta)){
                    encontrado=true;
                    
                    System.out.println("DATO ENCONTRADO!!");
                    
                    
                }
    }
    return valor;
}
}



