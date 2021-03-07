import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a < (b + c) && b < (a + c) && c < (a + b)) {
            int per = a + b + c;
            System.out.println("The perimeter if triangle is  " + per);
        } else {
            System.out.println("The input is invalid");
        }
    }
}
