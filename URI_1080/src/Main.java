import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int position = 0, max = 0;

        for (int i = 1; i <= 5; i++) {
            int number = scan.nextInt();

            if (number > max) {
                max = number;
                position = i;
            }
        }
        System.out.println(max);
        System.out.println(position);
    }
}
