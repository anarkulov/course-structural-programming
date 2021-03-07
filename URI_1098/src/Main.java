public class Main {
    public static void main(String[] args) {

        for (double i = 0; i <= 2; i += 0.2) {
            for (double j = 1; j <= 3; j++) {
                double k = (i + j);
                if (i == 0 || i == 1 || i < 2 && i > 1.9) {
                    System.out.printf("I=%.0f J=%.0f\n", i, k);
                } else {
                    System.out.printf("I=%.1f J=%.1f\n", i, k);
                }
            }
        }
    }
}