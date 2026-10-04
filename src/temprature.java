import java.util.Scanner;

public class temprature {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("temprature in fahrenheit : ");
        double temp = input.nextDouble();
        double cal = (temp - 32) * 5.0 / 9;
        System.out.println("temprature in Celsius is : " + cal);
    }
}
