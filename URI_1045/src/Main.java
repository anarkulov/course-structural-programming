import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double B = 0, C = 0;
        double A = Math.max(Math.max(a, b), c);

        if (A == a) {
            B = Math.max(b, c);
            C = Math.min(b, c);

        }else if (A == b) {
            B = Math.max(a, c);
            C = Math.min(a, c);

        }else if (A == c) {
            B = Math.max(a, b);
            C = Math.min(a, b);

        }

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        }else if ((A*A) == ((B*B) + (C*C))) {
            System.out.println("TRIANGULO RETANGULO");
        }else if ((A*A) > ((B*B) + (C*C))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }else if ((A*A) < ((B*B) + (C*C))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (A == B && A == C) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ( A == B && A != C || A == C && A != B || B == C && B != A) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}