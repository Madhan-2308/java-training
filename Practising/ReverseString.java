package Practising;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner ab = new Scanner(System.in);
         
        System.out.println("Enter the String:");

        String word = ab.nextString();

        String reversed = reverseString(word);
        System.out.println("the reversed string is: " + reversed);
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
