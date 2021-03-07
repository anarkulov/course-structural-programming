import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double d = scan.nextDouble();
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += d;
        }
        if (sum == 1.0) {
            System.out.println("Equal");
        }else {
            System.out.println("Not equal");
        }
        System.out.println(sum);
    }
}