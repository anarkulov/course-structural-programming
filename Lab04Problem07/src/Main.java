import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lottery = (int) (Math.random() * 1000);

        System.out.print("Enter a three-digit number: ");
        int guess = scan.nextInt();

        int lot1 = lottery / 100;
        int lot2 = lottery % 100 / 10;
        int lot3 = lottery % 100 % 10;

        int guess1 = guess / 100;
        int guess2 = guess % 100 / 10;
        int guess3 = guess % 100 % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery) {
            System.out.println("Exact match: you win $10,000");
        } else if ((guess1 == lot1 && guess1 == lot2 && guess1 == lot3) ||
                   (guess2 == lot1 && guess2 == lot2 && guess2 == lot3) ||
                   (guess3 == lot1 && guess3 == lot2 && guess3 == lot3)) {
            System.out.println("all digits match: you win $3,000");
        } else if (guess1 == lot1 || guess1 == lot2 || guess1 == lot3 ||
                   guess2 == lot1 || guess2 == lot2 || guess2 == lot3 ||
                   guess3 == lot1 || guess3 == lot2 || guess3 == lot3) {
            System.out.println("one digit matches: you win $1,000");
        } else {
            System.out.println("No matches");
        }
    }
}