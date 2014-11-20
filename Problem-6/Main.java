/*
*
*Copyright Florian Martin
*Nov 20, 2014
*/

package Problem6;

/**
 *
 * @author StormRed2
 */
public class Problem6 {
    
        private static void diff() {
            
            int sosq = 0; //sum of the squares 1² + 2² .....
            int sqofs = 0; //square of the sum (1+2+3...)²
            int i = 0;
            int j = 0;
            int num = 0;
            int num2 = 0;
            
            for(i = 0; i <=100; i++){
                num = i*i;
                sosq += num;
                
            }
            System.out.println(sosq);
            
            for(j = 0; j <= 100; j++){
                num2 += j;
            }
            sqofs = (num2 * num2);
            
            System.out.println(sqofs);
            
            System.out.println("Result: " +(sqofs - sosq));
    }


public static void main (String[] args){


    diff();

    }


}
