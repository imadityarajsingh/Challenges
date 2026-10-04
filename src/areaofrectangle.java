import java.util.Scanner;
public class areaofrectangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of the Rectangle: ");
        int firstNum = input.nextInt();
        System.out.println("Height of the Rectangle");
        int secondnum = input.nextInt();
        int Sum = firstNum * secondnum;
        System.out.println(Sum);
    }
}
