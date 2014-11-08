/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projekteuler;

/**
 *
 * @author StormRed2
 */
public class ProjektEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
      int i = 0;
      int sum = 0;
      
      for (i = 0; i < 1000; i++){
          if (i % 3 == 0 || i % 5 == 0){
          
              sum +=i;
          }
      System.out.println(sum);
      }

      System.out.println("End Value: " +sum);

        
 }    

   
}
