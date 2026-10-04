import java.util.Scanner;

public class compountInterest {
    static void main(String[] args) {


        System.out.println("Welcome to The Interest calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("Principal Amount: ");

        double principal = input.nextDouble();
        System.out.println("Rate of Interset: ");
        double interest = input.nextDouble();
        System.out.println("Time : ");
        double time = input.nextDouble();

        double compound = principal * Math.pow(1 + interest / 100, time);
        System.out.println("the Total amount With coumponding Interst is : " + compound);
    }
}



