import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of points? ");
        int p = scan.nextInt();
        char res;
        if (p >= 0 && p < 100) {
            if (p >= 90) {
                res = 'A';
            } else if (p >= 80) {
                res = 'B';
            } else if (p >= 70) {
                res = 'C';
            } else if (p >= 60) {
                res = 'D';
            } else {
                res = 'F';
            }
            System.out.println("Grade: " + res);
        } else {
            System.out.println(p + " is not in the permitted range");
        }
    }
}