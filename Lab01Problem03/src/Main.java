import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String fullname = scanner.nextLine();

        // Declaration and variable declaration
        System.out.println("Hello, " + fullname + "!");
    }
}