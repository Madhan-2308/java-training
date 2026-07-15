import java.util.Scanner;

 
 public class Challenge1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        
        int age = sc.nextInt();

        sc.nextLine();
        
        String city = sc.nextLine();


        System.out.println("my name is :" + name);
        
        System.out.println("my age is :"+ age);

        System.out.println("my address is :"+ city);
    }
    
}
