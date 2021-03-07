import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int z = scan.nextInt();
        int total = 0;
        int counter = 0;

        while (z <= x) {
            z = scan.nextInt();
        }

        for (int i = x; i < z; i++) {
            total += i;
            counter++;
            if (total > z) {
                break;
            }
        }
        System.out.println(counter);
    }
}
