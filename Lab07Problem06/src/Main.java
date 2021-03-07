import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int num = scan.nextInt();
        int[] scores = new int[num];
        char[] grades = new char[scores.length];

        System.out.printf("Enter %d scores: ", scores.length);
        for (int i = 0; i < scores.length; i++) {
                scores[i] = scan.nextInt();
        }

        getGrades(scores, grades);

        for (int i = 0; i < scores.length; i++){
            System.out.printf("Student %d score is %d and grade is %s\n", i, scores[i], grades[i]);
        }

    }
    public static int max(int[] scores){
        int max = scores[0];
        for (int i = 1; i < scores.length; i++){
            if (scores[i] > max){
                max = scores[i];
            }
        }
        return max;
    }

    public static void getGrades(int[] scores, char[] grades){
        int best = max(scores);
        for (int i = 0;  i < scores.length; i++){
            if (scores[i] >= best - 10){
                grades[i] = 'A';
            } else if (scores[i] >= best - 20){
                grades[i] = 'B';
            } else if (scores[i] >= best - 30){
                grades[i] = 'C';
            } else if (scores[i] >= best - 40){
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }
    }
}
