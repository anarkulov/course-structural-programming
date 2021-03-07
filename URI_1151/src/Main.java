import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int sum = 0;
        int a = 0, b = 1;
        int finish = 1;
        if (N > 0 && N < 46) {
            System.out.print("0 ");
            for (int i = 1; i < N; i++) {

                a = b;
                b = sum;
                sum = a + b;

                finish++;

                if (finish != N) {
                    System.out.print(sum + " ");
                } else {
                    System.out.println(sum);
                }
            }
        }
    }
}
