import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, min, mid = 0, max = 0;

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        min = Math.min(c, Math.min(a, b));

        if (min == a){
            mid = Math.min(b, c);
            max = Math.max(b, c);
        }else if (min == b){
            mid = Math.min(a, c);
            max = Math.max(a, c);
        }else if (min == c) {
            mid = Math.min(a, b);
            max = Math.max(a, b);
        }
        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}