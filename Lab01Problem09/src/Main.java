public class Main {
    public static void main(String[] args) {

        double a, b, c, d, j, k;
        a = 1.0/3;
        b = 1.0/5;
        c = 1.0/7;
        d = 1.0/9;
        j = 1.0/11;
        k = 1.0/13;
        double sum = 4 * (1 - a + b - c + d - j);
        double sum1 = 4 * (1 - a + b - c + d -j + k);
        System.out.printf("%.1f%n", sum);
        System.out.printf("%.1f%n", sum1);
    }
}