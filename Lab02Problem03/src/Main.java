import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A four-digit integer? ");
        int number = scan.nextInt();
        int a = number / 1000;
        int b = number / 100 % 10;
        int c = number / 10 % 10;
        int d = number % 10;
        int sum = (a + b + c + d);
        System.out.println("The sum of all digits is " + sum);
    }
}