import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int total = 0, num;
        while (n <= 0) {
            n = scan.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            num = x;
            total += num;
            x++;
        }
        System.out.println(total);
    }
}
