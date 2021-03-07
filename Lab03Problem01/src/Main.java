import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("some real number? ");
        double a = scan.nextDouble();
        double num = Math.abs(a);
        System.out.println("|"+a+"|" + " = " + num);
    }
}