import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x[] = new int[n];

        for (int i = 0; i < x.length; i++) {
            x[i] = scan.nextInt();
        }

        int min = 0;
        int tempMin = x[0];

        for (int i = 1; i < x.length; i++) {
            int min2 = x[i];
            min = Math.min(tempMin, min2);
            if (min < tempMin) {
                tempMin = min;
            }
        }

        System.out.println("Menor valor: " + min);
        System.out.println("Posicao: " + getIndexOfMin(x, min));
    }

    public static int getIndexOfMin(int[] a, int value) {
        int position = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                position = i;
            }
        }
        return position;
    }
}
