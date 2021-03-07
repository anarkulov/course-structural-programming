import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N: ");
        int N = scan.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.printf("Enter %d element: ", i);
            numbers[i] = scan.nextInt();
        }
        System.out.println("Before reserving: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }

        reverseArray(numbers);
        printArray(numbers);
    }

    public static void reverseArray(int[] a) {
        int j = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            j--;
        }
    }

    public static void printArray(int[] a) {
        System.out.println("\nAfter reversing:");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}
