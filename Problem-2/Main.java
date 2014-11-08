/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projekteuler;

/**
 *
 * @author StormRed2
 */
public class Problem2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(calc(10000));
    }
        
    private static int calc(int number){ 
            
        int fibo1=1; 
        int fibo2=2; 
        int fibonacci=1; //fibo2 is 2 becuase we dont start at 0
        int sum = 2;
        
        for(int i= 3; i<= number; i++){
            while (fibonacci < 4000000) {
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;
            
            if(fibonacci < 4000000 && fibonacci % 2 == 0)
            {
                sum += fibonacci;
            }
            }
        }
        System.out.println("Sum of even Numbers: " +sum);
        return fibonacci; //Fibonacci number
        
        }
        
        
        
        
    }
