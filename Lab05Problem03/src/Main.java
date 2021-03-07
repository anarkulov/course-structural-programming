import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 10;

        Scanner scan = new Scanner(System.in);

        System.out.print("Number of tests? ");
        int testCount = scan.nextInt();

        int correctAnswer = 0;
        int incorrectAnswer = 0;

        for (int i = 0; i < testCount; i++) {
            int num1 = (int) (Math.random() * (MAX + 1 - MIN));
            int num2 = (int) (Math.random() * (MAX + 1 - MIN));
            System.out.printf("%d + %d = ", num1, num2);

            int answer = scan.nextInt();
            if (num1 + num2 == answer) {
                ++ correctAnswer;
            } else {
                ++incorrectAnswer;
            }
        }
        System.out.println("Number of correct answers: " + correctAnswer);
        System.out.println("Number of incorrect answers: " + incorrectAnswer);

    }
}
