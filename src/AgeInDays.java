import java.util.Scanner;
public class AgeInDays {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR AGE AND FIND YOUR AGE IN DAYS");
        System.out.println("Please enter your Age ");
        int age = input.nextInt();
        int ageInDays = age * 365 ;
        System.out.println("You Have Lived About " + ageInDays + " Days");
    }
}
