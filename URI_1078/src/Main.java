import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = 0;
        for (int i = 1; i <= 10; i++) {
            M += 1;
            int res = M * N;
            System.out.printf("%d x %d = %d\n", M, N, res);
        }
    }
}