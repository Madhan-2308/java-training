import java.util.Scanner;
public class Addition {
    public static void main(String[] args){

        java.util.Scanner input = new Scanner(System.in);

        System.out.println("enter the first num:");
         
        int num1 = input.nextInt();

        System.out.println("enter the second num:");
         
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("sum:" + sum);
    }
    
}
