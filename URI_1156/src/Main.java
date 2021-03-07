public class Main {
    public static void main(String[] args) {

        double sum = 0;
        for (int i = 1, j = 1; i <= 39; i += 2, j *= 2) {

            sum += (double) i / j;
        }
        System.out.printf("%.2f\n", sum);
    }
}
