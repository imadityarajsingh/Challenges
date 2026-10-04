import java.util.Scanner;
public class simpleinterest {
    static void main(String[] args) {



        System.out.println("Welcome to The Interest calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Principal Amount: ");

        double principal = input.nextDouble();
        System.out.println("Rate of Interset: ");
        double interest = input.nextDouble();
        System.out.println("Time : ");
        double time = input.nextDouble();

        double simpleInterest = (principal * interest * time) / 100;
        System.out.println("Simple Interest amount :" + simpleInterest);
    }}
