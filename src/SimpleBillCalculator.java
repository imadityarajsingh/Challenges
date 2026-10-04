import java.util.Scanner;
public class SimpleBillCalculator {
    static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Name : ");
        String name = input.nextLine();
        System.out.print("price Of the Item : ");
        int firstNum = input.nextInt();
        System.out.print("Quantity: ");
        int secondNum = input.nextInt();
        int toltalAmount = firstNum * secondNum;
        System.out.println("Hello " + name);
        System.out.print("your Total bill is ");
        System.out.println(toltalAmount);
    }
}
