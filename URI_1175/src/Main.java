import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("N[%d] = %d\n", i, numbers[i]);
        }

    }

    private static void reverse(int[] numbers) {
        int j = numbers.length - 1;
        for (int i = 0; i < (numbers.length) / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            j--;
        }
    }
}