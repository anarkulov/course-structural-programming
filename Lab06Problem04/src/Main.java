import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        int a = scan.nextInt();

        System.out.print("B = ");
        int b = scan.nextInt();

        if (a == 0 && b == 0){
            System.out.printf("GCD(%d, %d) is not defined.\n", a, b);
        } else {
            System.out.printf("GCD(%d, %d) = %d\n", a, b, gcd(a, b));
        }
    }

    public static int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        } else if (a == b) {
            return a;
        } else if (a > b) {
            return gcd(a - b, b);
        } else {
            return gcd(a, b - a);
        }
    }
}