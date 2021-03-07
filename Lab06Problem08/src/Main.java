import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number for pattern: ");
        int n = scan.nextInt();

        displayPattern(n);
    }

    public static void displayPattern(int n) {
        int pat = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < pat; j++) {
                System.out.print("  ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
            pat--;
        }

    }
}
