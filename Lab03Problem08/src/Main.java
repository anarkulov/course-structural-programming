import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int min, mid, max;
        min = Math.min(a, Math.min(b, c));
        if (min == a) {
            mid = Math.min(b, c);
            max = Math.max(b, c);
        } else if (min == b) {
            mid = Math.min(a, c);
            max = Math.max(a, c);
        } else {
            mid = Math.min(a, b);
            max = Math.max(a, b);
        }
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}
