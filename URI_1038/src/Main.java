import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

         int X = scan.nextInt();
         int Y = scan.nextInt();
         double price = 0;
         if (X == 1) {
             price = (Y * 4.00);
         }else if (X == 2) {
             price = (Y * 4.50);
         }else if (X == 3) {
             price = (Y * 5.00);
         }else if (X == 4) {
             price = (Y * 2.00);
         }else if (X == 5) {
             price = (Y * 1.50);
         }
         System.out.printf("Total: R$ %.2f%n", price);
    }
}