import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X = scan.nextInt();
        int n = 6;

        for (int i = X; i < (X+(n*2)); i += 2) {
            if (i % 2 == 0) {
                i += 1;
            }
            System.out.println(i);
        }
    }
}