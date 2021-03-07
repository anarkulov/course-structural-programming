import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        for (int i = 1; i <= t; i++) {
            int N = scan.nextInt();

            long fib[] = new long[61];
            fib[0] = 0;
            fib[1] = 1;
            for (int j = 2; j < fib.length; j++) {
                fib[j] = fib[j - 1] + fib[j - 2];

            }
            System.out.printf("Fib(%d) = %d\n", N, fib[N]);
        }
    }
}