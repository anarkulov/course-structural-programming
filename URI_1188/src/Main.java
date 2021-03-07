import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String O = scan.nextLine();
        double[][] array = new double[12][12];
        double sum = 0;
        int total = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scan.nextDouble();
            }
        }

        int start = 5;
        int end = 7;
        for (int i = 7; i < array.length; i++) {
            for (int j = start; j < end; j++) {
                sum += array[i][j];
                total++;
            }
            start--;
            end++;
        }

        if (O.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else if (O.equals("M")){
            System.out.printf("%.1f\n", sum / total);
        }
    }
}
