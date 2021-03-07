
public class Main {
    public static void main(String[] args) {

        double start = 1;
        double finish = 901;
        System.out.println("\ni           m(i)    ");
        System.out.println("--------------------");

        for (double i = start; i <= finish; i += 100) {
            System.out.printf("%-12.0f", i);
            System.out.printf("%-6.4f\n", calculationPI(i));
        }

    }

    public static double calculationPI(double n) {
        double pi = 0;
        for (double i = 1; i <= n; i++) {
            pi += (Math.pow(-1, i + 1)) / ((2 * i) - 1);
        }
        pi*=4;
        return pi;
    }
}
