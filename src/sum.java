import java.util.Scanner;
public class sum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to My Calculator");
        System.out.print("Please Enter first number: ");
        int firstNum = input.nextInt();
        System.out.print("Please Enter Second Number: ");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.print("Sum of Your Both the Numbers Is : ");
        System.out.println(sum);

    }
}
