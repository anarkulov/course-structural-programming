import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextInt();
        double y1 = scan.nextInt();
        //circle point (0, 0) with 10 radius
        int x2 = 0, y2 = 0;
        double res = Math.sqrt((Math.pow((x2 - x1),2)) + (Math.pow(y2 - y1, 2)));
        if (res <= 10) {
            System.out.printf("(%.1f, %.1f) is in the circle\n", x1, y1);
        } else {
            System.out.printf("(%.1f, %.1f) is not in the circle\n", x1, y1);
        }
    }
}