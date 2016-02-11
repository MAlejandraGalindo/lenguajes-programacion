/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;

/**
 *
 * @author CQ43
 */
public class ValorMenorDeEdadException extends Exception{
   public ValorMenorDeEdadException(){
       super("no puedes meter un valor menor");
   }
    
}
