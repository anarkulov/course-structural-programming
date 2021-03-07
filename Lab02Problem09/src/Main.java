import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number of minutes: ");
        int min = scan.nextInt();
        int a = 365 * 24 * 60;
        int result = min / a;
        int result2 = (min % a) / (24 * 60);
        System.out.println(min + "minutes is approximately " + result + " and " + result2 + " days");
    }
}