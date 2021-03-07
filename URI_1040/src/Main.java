import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float n1 = scan.nextFloat();
        float n2 = scan.nextFloat();
        float n3 = scan.nextFloat();
        float n4 = scan.nextFloat();

        float average = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;

        if (average >= 7.0) {
            System.out.printf("Media: %.1f%n", average);
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.printf("Media: %.1f%n", average);
            System.out.println("Aluno reprovado.");
        } else if (average >= 5 && average < 7) {
            System.out.printf("Media: %.1f%n", average);
            System.out.println("Aluno em exame.");
            float n5 = scan.nextFloat();
            System.out.printf("Nota do exame: %.1f%n", n5);
            float n6 = (average + n5) / 2;
            if (n6 >= 5) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f%n", n6);
            } else if (n6 < 5) {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f%n", n6);
            }
        }
    }
}
