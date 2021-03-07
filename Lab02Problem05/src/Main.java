import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Temperature in degrees Fahrenheit? ");
        double degreesFahrenheit = scan.nextDouble();
        double degreesCelsius = (degreesFahrenheit - 32) * 5.0/9.0;
        System.out.printf("The temperature in degrees Celsius is %.2f%n", degreesCelsius);
    }
}