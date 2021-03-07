import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (scan.hasNext()) {
            int x = scan.nextInt();
            int[][] array = new int[x][x];

            int c = (x / 3);
            for (int i = c; i < x - c; i++) {
                for (int j = c; j < x - c; j++) {
                    array[j][i] = 1;
                }
            }
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    if (array[j][i] != 1 && j == i) {
                        array[j][i] = 2;
                    }
                }
            }
            int h = x - 1, l = 0;
            while (h >= 0 && l <= x - 1) {
                if (array[l][h] != 1) {
                    array[l][h] = 3;
                    h--;
                    l++;
                } else if (array[l][h] == 1) {
                    h = c - 1;
                    l = x - c;
                }
            }
            array[(x / 2)][(x / 2)] = 4;
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}