public class Main {
    public static void main(String[] args) {

        int p = 312032486;
        int sec = 365 * 24 * 60 * 60;
        // Birth
        double sum = sec / 7.0;
        // Death
        double sum2 = sum - (sec / 13.0);
        // Immigrant
        double sum3 = sum2 + (sec / 45.0);

        double result1 = p + sum3;
        double result2 = result1 + sum3;
        double result3 = result2 + sum3;
        double result4 = result3 + sum3;
        double result5 = result4 + sum3;

        System.out.printf("1st year  %.0f%n", result1);
        System.out.printf("2nd year  %.0f%n", result2);
        System.out.printf("3d year   %.0f%n", result3);
        System.out.printf("4th year  %.0f%n", result4);
        System.out.printf("5th year  %.0f%n", result5);
    }
}