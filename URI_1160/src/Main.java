import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int pA = scan.nextInt();
            int pB = scan.nextInt();
            float gA = scan.nextFloat();
            float gB = scan.nextFloat();

            int years = 0;
            do {
                float sumA = (int) Math.floor((pA * gA) / 100.0);
                float sumB = (int) Math.floor((pB * gB) / 100.0);
                pA += sumA;
                pB += sumB;
                years++;
                if (years > 100) {
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            } while (pA <= pB);
            if (years <= 100) {
                System.out.println(years + " anos.");
            }
        }
    }
}