import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int total = 0;
        int max = Math.max(x, y);
        int min = Math.min(x, y);

        for (int i = min; i <= max; i++) {
            if (i % 13 != 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}