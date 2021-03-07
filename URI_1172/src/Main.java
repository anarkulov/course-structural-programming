import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] x = new int[10];
        for (int i = 0; i < 10; i++) {
            int number = scan.nextInt();
            if (number <= 0) {
                x[i] = 1;
            } else {
                x[i] = number;
            }
            System.out.printf("X[%d] = %d\n", i, x[i]);
        }
    }
}
