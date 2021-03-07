import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count[] = new int[100];


        input(count);

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(i + 1 + "occurs " + count[i]+ " time" + (count[i] > 1 ? "s" : ""));
            }
        }
    }

    public static void input(int[] counts) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the integers between 1 and 100: ");
        int numbers;
        do {
            numbers = scan.nextInt();
            if (numbers > 0 && numbers <= 100) {
                counts[numbers - 1]++;
            }
        } while (numbers != 0);
    }
}

