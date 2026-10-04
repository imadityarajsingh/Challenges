import java.util.Scanner;
public class areaoftriangle {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Base : ");
        double base = input.nextDouble();
        System.out.println("Height");
        double height = input.nextDouble();
        double area = 0.5*(base*height);
        System.out.println("Area of the given triangle :" + area);
    }}
