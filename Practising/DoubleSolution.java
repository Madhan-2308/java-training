package Practising;

import java.util.Scanner;

public class DoubleSolution {
    public static void main(String[] args){ 

        Scanner dd = new Scanner(System.in);

        System.out.println("enter the first number:");
        double a = dd.nextDouble();

        System.out.println("enter the second number:");
        double b = dd.nextDouble();
        
        System.out.println( a > 0 && b < 1  && a < 1 && b > 0  );
          
       
    }
}
