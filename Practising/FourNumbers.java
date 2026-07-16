package Practising;
import java.util.Scanner;

public class FourNumbers {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter the first number:");
        int a = sc.nextInt();

        System.out.println("enter the second number:");
        int b = sc.nextInt();

        System.out.println("enter the third number:");
        int c = sc.nextInt();

        System.out.println("enter the fourth number:");
        int d = sc.nextInt();

        if(a == b && b == c && c == d && d == a)
            
            System.out.println("the four numbers are equal");

        else 
            System.out.println("they are not equal");   
    }
    
}
