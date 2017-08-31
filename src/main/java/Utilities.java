
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */

public class Utilities {
   
    
     
     /**
      * 
      * @param texto
      * @return 
      *  Imprime los 20 primeros caracteres
      */
    
   
    
    @Dependent
    public String getResume (String texto){
      
      char [] arrayChar =texto.toCharArray();
      for (int i=0; i<arrayChar.length; i++){
          if (i<=20){
      
         System.out.println(""+arrayChar[i]);  
          }
          
      }
      return texto;
  }
    /**
     * 
     * @param texto
     * @return 
     * Imprime la capitalizacion del texto
     */
    public String capitalizar (String texto){
       String capitalizada="";
       capitalizada=capitalizada+texto.toUpperCase();
       System.out.println(""+capitalizada);
     return texto;
    }
    /**
     * 
     * @param frase
     * @param texto
     * @return 
     * Comprueba si las frases ingresadas son iguales
     */
    public String contarCoincidencias (String frase, String texto){
        if (frase.equals(texto)){
            System.out.print("Misma frase");
        }else{
            System.out.print("ERROR, NO ES LA MISMA PALABRA");
        }
        return frase;
        
    }
}
