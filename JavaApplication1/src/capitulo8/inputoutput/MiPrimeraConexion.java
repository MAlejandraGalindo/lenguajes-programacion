/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.inputoutput;

import java.net.*;
import java.io.*;

public class MiPrimeraConexion {
    public static void main(String[] args) throws  Exception{
        //primero vamos a usar una clase que se llama url
        URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        url.openConnection();
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
            InputStream input=con.getInputStream();
            InputStreamReader isr=new InputStreamReader(input);
            BufferedReader reader=new BufferedReader(isr);
            ///int renglones=0;
            ///boolean encontrado=false;
            ///String temperaturas[]=new String[5];
            String lineaActual="no ha leido nada";
              boolean encontrado=false;
              int miLinea=0;
            while((lineaActual=reader.readLine())!=null){
                if(encontrado &&miLinea<=0){
                    //VAMOS A DESPEDAZAR LA LINEA
                    int indice=lineaActual.indexOf(">");
                   int indice2= lineaActual.indexOf("</");
                           
                            
                    String temActual=lineaActual.substring(indice+1,indice2);
                    System.out.println(temActual);
                    miLinea++;
                }
                if (lineaActual.contains("Outside Temp")){
                    encontrado=true;
                    
                    System.out.println("DATO ENCONTRADO!!");
                    
                    
                }
               /// String renglonActual=reader.readLine();
                ///if(renglonActual.contains("Outside Te"))
                  ///ncontrado=true;
                //System.out.println("Si existe este renglon");
            }
            
            }
             //   renglones++;
              //  if(reader.readLine().contains("Current Conditions as of") ||renglones==100){
               // reader.readLine();
               // System.out.println(reader.readLine());
          //  }
           //  String hola="<td width=class summary_dat>21.1 C</td>";
           //   int indice=hola.indexOf("sumary_data");
            //  int indice2=hola.indexOf("</td>");
            //  String nuevo=hola.substring(indice+13, indice2);
             // System.out.println(nuevo);
                
                     }
            


   
        
   

