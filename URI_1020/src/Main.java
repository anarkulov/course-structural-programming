import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = 365, month = 30;
        int number = scan.nextInt();
        int a = number / year;
        int b = number % year / month;
        int c = number % year % month;

        System.out.println(a + " ano(s)");
        System.out.println(b + " mes(es)");
        System.out.println(c + " dia(s)");
    }
}