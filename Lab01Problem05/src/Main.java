import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1st double? ");
        double firstDouble = scanner.nextDouble();
        System.out.print("2nd double? ");
        double secondDouble = scanner.nextDouble();

        double sum1 = firstDouble + secondDouble;
        double sum2 = firstDouble - secondDouble;
        double sum3 = firstDouble * secondDouble;
        double sum4 = firstDouble / secondDouble;
        double sum5 = firstDouble % secondDouble;
        System.out.println(firstDouble + " + " + secondDouble + " = " + sum1);
        System.out.println(firstDouble + " - " + secondDouble + " = " + sum2);
        System.out.println(firstDouble + " * " + secondDouble + " = " + sum3);
        System.out.println(firstDouble + " / " + secondDouble + " = " + sum4);
        System.out.println(firstDouble + " % " + secondDouble + " = " + sum5);
    }
}