/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projekteuler;

/**
 *
 * @author StormRed2
 */
public class Problem3 {
    
    
      public static void main(String[] args) {
          
          System.out.println("Biggest Prime: " +calc(600851475143L));
      }
    
      private static int calc(long input){ 
        
          int i;
          
          for (i = 2; i <= input; i++){
             if(input % i == 0){
               input /= i;
               i--;
               
             }
          
        }
          
          return +i;
    }
        
}

