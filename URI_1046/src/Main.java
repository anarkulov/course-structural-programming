import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = 24;


        if (a > b) {
            int hours = ((h - a) + b);
            System.out.println("O JOGO DUROU " + hours + " HORA(S)");

        }else if (a < b) {
            int hours = (b - a);
            System.out.println("O JOGO DUROU " + hours + " HORA(S)");
        }else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
    }
}