import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int MONEY = scan.nextInt();
        int hundred = MONEY / 100;
        int fifty   = MONEY % 100 / 50;
        int twenty  = MONEY % 100 % 50 / 20;
        int ten     = MONEY % 100 % 50 % 20 / 10;
        int five    = MONEY % 100 % 50 % 20 % 10 / 5;
        int two     = MONEY % 100 % 50 % 20 % 10 % 5 / 2;
        int one     = MONEY % 100 % 50 % 20 % 10 % 5 % 2;

        System.out.println(MONEY);
        System.out.println(hundred + " nota(s) de R$ 100,00");
        System.out.println(fifty + " nota(s) de R$ 50,00");
        System.out.println(twenty + " nota(s) de R$ 20,00");
        System.out.println(ten + " nota(s) de R$ 10,00");
        System.out.println(five + " nota(s) de R$ 5,00");
        System.out.println(two + " nota(s) de R$ 2,00");
        System.out.println(one + " nota(s) de R$ 1,00");
    }
}