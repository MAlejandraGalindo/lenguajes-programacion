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
   public ValorMenorDeEdadException(){   ///el constructor
       super("no puedo dar de alta a un menor de 18 años");
   }
    
}
