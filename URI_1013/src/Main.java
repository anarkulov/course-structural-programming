import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int A = (a + b + Math.abs(a - b)) / 2;
        int res = (A + c + Math.abs(A - c)) / 2;
        System.out.println(res + " eh o maior");
    }
}