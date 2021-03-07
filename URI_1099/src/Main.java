import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            int total = 0;
            int X = scan.nextInt();
            int Y = scan.nextInt();

            if (X > Y) {
                for (int k = X - 1; k > Y; k--) {
                    if (k % 2 != 0) {
                        total += k;
                    }
                }
            } else {
                for (int k = Y - 1; k > X; k--)
                    if (k % 2 != 0) {
                        total += k;
                    }
            }
            System.out.println(total);
        }
    }
}
