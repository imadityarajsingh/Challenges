import java.util.Scanner;
public class perimeteroftriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lenght Of the Rectangle :");
        double firstNum = input.nextDouble();
        System.out.println("Height of the Rectangle :");
        double secondNum = input.nextDouble();
        double parameter = 2*(firstNum) + 2*(secondNum);
        System.out.println("Parameter Of our trinagle :" + parameter);
    }}
