import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // area = radius * radius * Pi
        // volume = area * length
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the radius and length of cylinder: ");
        double Pi = 3.14159;
        double radius = scan.nextDouble();
        int length = scan.nextInt();
        double area = radius * radius * Pi;
        double volume = area * length;
        System.out.printf("The area is %.4f%n", area);
        System.out.printf("The volume is %.1f%n", volume);

    }
}
