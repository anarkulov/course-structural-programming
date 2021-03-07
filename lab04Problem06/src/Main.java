import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        //rectangle (0, 0) width 10, height 5;

        if (x <= 10 / 2 && y <= 5.0 / 2) {
            System.out.printf("Point (%.1f, %.1f) is in the rectangle\n", x, y);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the rectangle\n", x, y);
        }
    }
}
