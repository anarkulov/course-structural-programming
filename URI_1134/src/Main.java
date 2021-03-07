import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int alcohol = 0, gasoline = 0, diesel = 0, end = 0;
        int finish = 0;
        System.out.println("MUITO OBRIGADO");

        do {
            int x = scan.nextInt();
            if (x >= 1 && x <= 4) {
                if (x == 1) {
                    alcohol++;
                } else if (x == 2) {
                    gasoline++;
                } else if (x == 3) {
                    diesel++;
                } else {
                    end = 4;
                }
            }

            finish = end;

        }while (finish != 4);

        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasoline);
        System.out.println("Diesel: " + diesel);
    }
}