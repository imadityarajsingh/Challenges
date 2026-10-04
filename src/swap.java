import java.util.Scanner;
public class swap {
    static void main(String[] args) {

      Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping Station\n\n");
        System.out.println("enter value of A:");
        int A = input.nextInt();
        System.out.println("Enter the value of B");
        int B = input.nextInt();
        System.out.println("Your Values are " + A  + "," +  B);
        int C = A;
         A = B;
         B = C;

        System.out.println("value of A: " + A);
        System.out.println("Value of B: " + B );



    }}
