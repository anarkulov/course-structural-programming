import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int C = scan.nextInt();
        String T = scan.next();
        float sum = 0, average;
        float[][] XY = new float[12][12];

        for (int i = 0; i < XY.length; i++) {
            for (int j = 0; j < XY.length; j++) {
                XY[i][j] = scan.nextFloat();
            }
        }
        for (int k = 0; k < XY.length; k++) {
            sum += XY[k][C];
        }
        average = sum / 12;

        switch (T) {
            case "S":
                System.out.printf("%.1f\n", sum);
                break;
            case "M":
                System.out.printf("%.1f\n",average);
                break;
        }
    }
}