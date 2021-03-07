
public class Main {
    public static void main(String[] args) {

        double start = 1;
        double finish = 20;
        System.out.println("\ni           m(i)    ");
        System.out.println("--------------------");

        for (double i = start; i <= finish; i ++) {
            System.out.printf("%-12.0f", i);
            System.out.printf("%-6.4f\n", calculationM(i));
        }

    }

    public static double calculationM(double n) {
        double m = 0;
        for (double i = 1; i <= n; i++) {
            m += i / (i + 1);

        }
        return m;
    }
}
