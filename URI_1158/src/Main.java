import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i = 1; i <= N; i++) {
            int counter = 0,  sum = 0;
            int x = scan.nextInt();
            int y = scan.nextInt();
            for (int j = x; counter < y; j++) {
                if (j % 2 != 0) {
                    sum += j;
                    counter++;
                }
            }
            System.out.println(sum);
        }
    }
}
