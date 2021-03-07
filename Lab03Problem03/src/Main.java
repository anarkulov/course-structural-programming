import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("1st number? ");
        int a = scan.nextInt();
        System.out.print("2nd number? ");
        int b = scan.nextInt();
        System.out.print("3rd number? ");
        int c = scan.nextInt();

        int greatest;
        if (a > b){
            if (a > c) {
                greatest = a;
            } else {
                greatest = c;
            }
        } else if (b > c) {
            greatest = b;
        } else {
            greatest = c;
        }
        System.out.printf("The value %d is the greatest one.%n", greatest);
    }
}