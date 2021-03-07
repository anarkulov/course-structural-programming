import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            System.out.printf("N[%d] = %d\n", i, x);
            x *= 2;
        }
    }
}
