import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int finish = 0, number = 1;

        if (N > 1 && N < 1000) {
            while (finish != N) {
                int res = (int) Math.pow(number, 2);
                int res2 = (int) Math.pow(number, 3);
                System.out.printf("%d %d %d\n", number, res, res2);
                number++;
                finish++;
            }
        }
    }
}