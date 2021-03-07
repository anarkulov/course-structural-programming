import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        int number = scan.nextInt();
        double result = (9.0 / 5.0) * number + 32;
        System.out.println(number + " Celsius is " + result + " Fahrenheit");
    }
}