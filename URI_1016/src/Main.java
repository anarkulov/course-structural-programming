import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = 2;
        int a = scan.nextInt();
        int res = a * t;

        System.out.println(res + " minutos");
    }
}