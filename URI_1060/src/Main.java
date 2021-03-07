import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positive = 0;
        for (int i = 0; i < 6; ++i) {
            double a = scan.nextDouble();
            if (a > 0) {
                ++positive;
            }
        }
        System.out.println(positive + " valores positivos");
    }
}