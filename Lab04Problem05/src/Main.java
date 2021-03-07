import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Year? ");
        int a = scan.nextInt();
        System.out.print("Month? ");
        int b = scan.nextInt();

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            if (b > 0 && b <= 12 ) {
                if (b % 2 != 0 || b == 8 || b == 10 || b == 12) {
                    System.out.println("Number of days: 31");
                } else if (b == 2) {
                    System.out.println("Number of days: 29");
                } else {
                    System.out.println("Number of days: 30");
                }
            }
        } else {
            if (b > 0 && b <= 12 ) {
                if( b % 2 != 0  && b == 8 || b == 10 || b == 12) {
                    System.out.println("Number of days: 31");
                }else if (b == 2) {
                    System.out.println("Number of days: 28");
                }else {
                    System.out.println("Number of days: 30");
                }
            }
        }
    }
}
