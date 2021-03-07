import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();

        int hours = a - A;
        int min = b - B;

        if (hours < 0) {
            hours += 24;
        }
        if (min < 0) {
            min = 60 + min;
            hours--;
            if (hours < 0) {
                hours += 24;
            }
        }
        if (A == a && B == b) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", hours, min);
        }
    }
}