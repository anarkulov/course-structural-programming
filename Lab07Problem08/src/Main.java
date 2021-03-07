import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbers[] = new int[100];
        double average = 0;
        double sum = 0;

        System.out.print("Enter the numbers: ");

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
            if (numbers[i] < 0){
                break;
            }
            sum += numbers[i];
            count++;
        }

        average = sum / count;

        int above = 0;
        int below = 0;
        for (int i = 0; i < count; i++){
            if (numbers[i] >= average){
                above++;
            } else {
                below++;
            }
        }

        System.out.printf("Average is %.2f\n", average);
        System.out.println("The number of  scores above to average: " + above);
        System.out.println("The number below to average:  " + below);
    }
}

