import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("1st number? ");
        int a = scan.nextInt();
        System.out.print("2nd number? ");
        int b = scan.nextInt();
        if (a >= b) {
            System.out.println("The first number " + "(" + a + ")" + " is the greater than second " + "(" + b + ").");
        }else if (a <= b) {
            System.out.println("The second number " + "(" + b + ")" + " is the greater or equal to first " + "(" + a + ").");
        }
    }
}