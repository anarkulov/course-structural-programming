import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        for (int i = 0; i < x; i++) {
            int number = scan.nextInt();

            if (isPrime(number)) {
                System.out.println(number + " eh primo");
            } else {
                System.out.println(number + " nao eh primo");
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int k = 2; k <= number / 2; k++) {
            if (number % k == 0) {
                return false;
            }
        }
        return true;
    }
}