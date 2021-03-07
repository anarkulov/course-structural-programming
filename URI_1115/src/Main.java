import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x;
        int y;
        while (((x = scan.nextInt()) != 0) && ((y = scan.nextInt()) != 0)) {
            if (x > 0) {
                if (y > 0) {
                    System.out.println("primeiro");
                } else {
                    System.out.println("quarto");
                }
            } else {
                if (y < 0) {
                    System.out.println("terceiro");
                } else {
                    System.out.println("segundo");
                }
            }
        }
    }
}