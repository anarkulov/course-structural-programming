import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Scissor(0), rock(1), paper(2): ");
        int user = scan.nextInt();
        int comp = (int) (Math.random() * 3);
        if (user >= 0 && user <= 2 && comp >= 0 && comp <= 2) {
            if (user == 0) {
                if (comp == 2) {
                    System.out.println("The computer is paper. You are scissor. You won");
                } else if (comp == 1) {
                    System.out.println("The computer is rock. You are scissor. Computer won");
                } else {
                    System.out.println("The computer is scissor. You are too. it is a draw");
                }
            } else if (user == 1) {
                if (comp == 0) {
                    System.out.println("The computer is scissor. You are rock. You won");
                } else if (comp == 2) {
                    System.out.println("The computer is paper. You are rock. Computer won");
                } else {
                    System.out.println("The computer is rock. You are too. it is a draw");
                }
            } else {
                if (comp == 0) {
                    System.out.println("The computer is scissor. You are paper. Computer won");
                } else if (comp == 1) {
                    System.out.println("The computer is rock. You are paper. You won");
                } else {
                    System.out.println("The computer is paper. You are too. it is a draw");
                }
            }
        }
    }
}