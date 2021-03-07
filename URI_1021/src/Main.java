import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number1 = scan.nextDouble();
        int number  = (int) number1;

        int a = number / 100;
        int b = number % 100 / 50;
        int c = number % 100 % 50 / 20;
        int d = number % 100 % 50 % 20 / 10;
        int j = number % 100 % 50 % 20 % 10 / 5;
        int k = number % 100 % 50 % 20 % 10 % 5 / 2;

        System.out.println("NOTAS:");
        System.out.println(a + " nota(s) de R$ 100.00");
        System.out.println(b + " nota(s) de R$ 50.00");
        System.out.println(c + " nota(s) de R$ 20.00");
        System.out.println(d + " nota(s) de R$ 10.00");
        System.out.println(j + " nota(s) de R$ 5.00");
        System.out.println(k + " nota(s) de R$ 2.00");

        double Aa = (number1 * 100) % 100;
        int A = number % 100 % 50 % 20 % 10 % 5 % 2;
        int B = (int) Aa / 50;
        int C = (int) Aa % 50 / 25;
        int D = (int) Aa % 50 % 25 / 10;
        int J = (int) Aa % 50 % 25 % 10 / 5;
        int K = (int) Aa % 50 % 25 % 10 % 5;

        System.out.println("MOEDAS:");
        System.out.println(A + " moeda(s) de R$ 1.00");
        System.out.println(B + " moeda(s) de R$ 0.50");
        System.out.println(C + " moeda(s) de R$ 0.25");
        System.out.println(D + " moeda(s) de R$ 0.10");
        System.out.println(J + " moeda(s) de R$ 0.05");
        System.out.println(K + " moeda(s) de R$ 0.01");
    }
}