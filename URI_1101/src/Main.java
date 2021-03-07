import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum;
        int M, N;

        while ((M = scan.nextInt()) > 0 && (N = scan.nextInt()) > 0){
            sum = 0;
            int m = Math.max(M, N);
            int n = Math.min(M, N);
            for (int i = n; i <= m; i++) {
                sum += i;
                System.out.printf("%d ", i);
            }
            System.out.println("Sum=" + sum);
        }

    }
}