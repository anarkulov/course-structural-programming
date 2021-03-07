import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String operation = scan.nextLine();
        float[][] array = new float[12][12];
        float sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = scan.nextFloat();
            }
        }
        int count = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < count; j++) {
                sum += array[i][j];
            }
            count--;
        }
        if (operation.equals("S")){
            System.out.printf("%.1f\n",sum);
        } else {
            float average = sum / 66.0f;
            System.out.printf("%.1f\n", average);
        }
    }
}
