/*
*
*Copyright Florian Martin
*Nov 20, 2014
*/

package Problem4;

import javax.swing.JOptionPane;

/**
 *
 * @author StormRed2
 */
public class Problem4 {

    
        private static int rev(int num) {
        
            int inv = 0;
             while (num > 0){ //9009
                 inv = inv * 10 + (num % 10);
                 num = num / 10;
             }
            //System.out.println("The Inverse is: " +inv);
            return inv;
       
    }
    
    private static void palin() {
        
       //int input = 9009;
       //int palin = input; 
       //int rev = 0;
       int maxNumberOne = 999;
       int maxNumberTwo = 999;
       int tempNum = 1;
       int i;
       int j;
       int biggestPali = 0;
       
       for (i = 99; i<=maxNumberOne; i++){ //99
           for (j = 91; j<=maxNumberTwo; j++){ //91
               tempNum = i * j; //9009
               if(tempNum == rev(tempNum) && tempNum>biggestPali){
                  //9009 == 
                   biggestPali = tempNum;
                   
               }
           }
           
       }
       System.out.println("Biggest Palindrom is: " +biggestPali);
       /*
       while (palin !=0)
       {
           int remainder = palin % 10;
           rev = rev * 10 + remainder;
           palin = palin / 10;
       }    
           if (input == rev)
           {
               System.out.println("Is a Palindrom");
           }
           else
           {
               System.out.println("Is NOT a Palindrom");
           }
         */  
       
        
    }

public static void main (String[] args){
    
   /* String input;
    
    input = JOptionPane.showInputDialog("Enter lenght of digits:");
    
        if (input != null)
        {
            int coninput = Integer.parseInt(input);
            
            palin(coninput);
        }
*/
    palin();
    }


    
}
