import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int n = scan.nextInt();

        int[] counters = new int [11];
        for (int i = 0; i < n; i++) {
            int die1 = random(1, 6);
            int die2 = random(1, 6);

            int sum = die1 + die2;
            ++counters[sum - 2];
        }
        for (int i = 0; i < counters.length; ++i) {
            System.out.printf("%d: %d\n", i + 2, counters[i]);
        }
    }
    private static int random (int min, int max) {
        return (int) (min + Math.random() * (max + 1 - min));
    }
}
