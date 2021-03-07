import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positive = 0;
        float res = 0;
        float total = 0;

        for (int i = 1; i <= 6; i++) {
            float a = scan.nextFloat();
            if (a > 0) {
                positive +=1;
                total += a;
                res = (total / positive);
            }
        }
        System.out.println(positive + " valores positivos");
        System.out.printf("%.1f%n", res);
    }
}