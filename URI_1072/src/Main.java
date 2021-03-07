import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int in = 0, out = 0;
        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            int X = scan.nextInt();
            if (X >= 10 && X <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}