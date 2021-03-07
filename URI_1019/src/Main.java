import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int a = N / 3600;
        int b = N % 3600 / 60;
        int c = N % 360 % 60;
        System.out.println(a + ":" + b + ":" + c);
    }
}