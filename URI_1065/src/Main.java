import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int even = 0;
        for (int i = 1; i <= 5; i++) {
            int a = scan.nextInt();
            if (a % 2 == 0) {
                even += 1;
            }
        }
        System.out.println(even + " valores pares");
    }
}