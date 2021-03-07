import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Complexity level? ");
        int a = scan.nextInt();

        if (a == 0) {
            System.out.println("You are a total newbie");
        } else if (a == 1) {
            System.out.println("You are a beginner");
        } else if (a > 1 && a <= 3) {
            System.out.println("You are an experienced gamer");
        } else if ( a > 3 && a <= 5) {
            System.out.println("You are a pro gamer");
        } else {
            System.out.println("Invalid level");
        }
    }
}