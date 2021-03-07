import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int total = 0;
        int coelho = 0;
        int rato = 0;
        int sapo = 0;
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        for (int i = 1; i <= N; i++) {
            int number = scan.nextInt();
            String name = scan.next();

            total += number;

            switch (name) {
                case "C":
                    coelho += number;
                    break;
                case "R":
                    rato += number;
                    break;
                case "S":
                    sapo += number;
                    break;
            }

            sum1 = (double) coelho * 100 / total;
            sum2 = (double) rato * 100 / total;
            sum3 = (double) sapo * 100 / total;
        }
        System.out.printf("Total: %d cobaias\n", total);
        System.out.println("Total de coelhos: " + coelho);
        System.out.println("Total de ratos: " + rato);
        System.out.println("Total de sapos: " + sapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n", sum1);
        System.out.printf("Percentual de ratos: %.2f %%\n", sum2);
        System.out.printf("Percentual de sapos: %.2f %%\n", sum3);

    }
}
