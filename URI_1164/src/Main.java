import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        for (int i = 0; i < x; i++) {
            int number = scan.nextInt();

            if (isPerfect(number)) {
                System.out.println(number + " eh perfeito");
            } else {
                System.out.println(number + " nao eh perfeito");
            }
        }
    }
    private static boolean isPerfect(int number) {

        int divisors = 0;
        for (int i = 1; i < number; i++) {
            divisors += i;
                if (divisors == number) {
                    return true;
                }
            }
        return false;
    }
}
