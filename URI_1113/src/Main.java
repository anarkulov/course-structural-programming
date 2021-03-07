import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x, y;
        do {
            x = scan.nextInt();
            y = scan.nextInt();
            if (x > y) {
                System.out.println("Decrescente");
            } else if (y > x) {
                System.out.println("Crescente");
            }
        } while (x != y) ;
    }
}