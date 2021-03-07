import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1st int? ");
        int firstNumber = scanner.nextInt();
        System.out.print("2nd int? ");
        int secondNumber = scanner.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
        int sum1 = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + sum1 );
        int sum2 = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = "  + sum2);
        int sum3 = firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + sum3);
        int sum4 = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + sum4);
    }
}