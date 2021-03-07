import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int[][] m = getArray();

        int total = 0;
        for (int row = 0; row < m.length; row++){
            for (int column = 0; column < m[row].length; column++){
                total += m[row][column];
            }
        }
        System.out.println("Sum of all elements is " + total);

    }

    private static int[][] getArray() {
        Scanner scan = new Scanner(System.in);

        int[][] m = new int[3][4];
        System.out.printf("Enter %d rows and %d columns:\n", m.length, (m[0].length));
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = scan.nextInt();
            }
        }
        return m;
    }
}