import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long number = scan.nextInt();

        System.out.println(sumDigits(number));

    }

    public static int sumDigits(long n){
         int sum = 0;
        while (n != 0){
             sum += n % 10;
             n /= 10;
         }
         return sum;
    }
}
