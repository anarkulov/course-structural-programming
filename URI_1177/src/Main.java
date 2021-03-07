import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] N = new int[1000];
        int T = scan.nextInt();
        for (int i = 0, j = 0; i < N.length; i++, j++) {
            N[j] = j;
            if (j == T) {
                j = 0;
            }
            System.out.printf("N[%d] = %d\n", i, N[j]);
        }
    }
}
