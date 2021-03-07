import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double pi = 3.14159;
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();

        double TRIANGULO = (A * C) / 2.0;
        double CIRCULO = pi * Math.pow(C, 2);
        double TRAPEZIO = ((A + B)/2) * C;
        double QUADRADO = Math.pow(B, 2);
        double RETANGULO = A * B;

        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);
    }
}
