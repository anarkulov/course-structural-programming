import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];
        int a = 0, b = 0;

        for (int i = 0; i < 15; i++) {
            int number = scan.nextInt();
            if (number % 2 == 0) {
                par[a] = number;
                a++;
            } else {
                impar[b] = number;
                b++;
            }
            if (a == 5) {
                for (int j = 0; j < 5; j++) {
                    System.out.printf("par[%d] = %d\n", j, par[j]);
                }
                a = 0;
            } if (b == 5){
                for (int j = 0; j < 5; j++) {
                    System.out.printf("impar[%d] = %d\n", j, impar[j]);
                }
                b = 0;
            }
        }
        for (int j = 0; j < b; j++) {
            System.out.printf("impar[%d] = %d\n", j, impar[j]);
        }
        for (int j = 0; j < a; j++) {
            System.out.printf("par[%d] = %d\n", j, par[j]);
        }

    }
}