packkage Practising;

import java.util.Scanner;

public class DigitSum{

public static void main(String[] args){
     Scanner put = new Scanner(System.in);
     
     System.out.println("enter the number:");
     long num = put.nextLong();

     System.out.println("the sum of the digits is: " + sumDigit(num));
    
     public static int sumDigit(long num){
        int sum = 0;
        while(num !=0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
     }

    }

    
}
