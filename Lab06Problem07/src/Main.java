import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (isPalindrome(num)) {
            System.out.println("The number is Palindrome");
        } else {
            System.out.println("The number is not Palindrome");
        }
    }

    public static int reverse(int number){
        int rev = 0;
        int x;
        while (number != 0) {
           x = number % 10;
           rev = rev * 10 + x;
           number /= 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int number2) {
        return number2 == reverse(number2);
    }
}
