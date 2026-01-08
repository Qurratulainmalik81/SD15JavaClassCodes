
import java.util.Scanner;

public class Welcome1{
    public static void main(String args[]){
        System.out.println("Welcome to Java");
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Enter num1");
        num1 = input.nextInt();
        System.out.println("Enter num2");
        num2 = input.nextInt();
        int sum = num1 + num2;
        // num1 + num2 = 30
        System.out.println("num1 + num2 = " + sum);
   
   // System.out.print("again\n");
    //System.out.println("\"\tWelcome to Java\t\"\\");
        System.out.printf("%d + %d = %d", num1,num2,sum);

    }
}