import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x;
        do {
            x = scan.nextInt();
            if (x != 0){
                int counter = 1, sum = 0;
                for (int i = x; counter <= 5; i++) {
                    if (i % 2 == 0) {
                        sum += i;
                        counter++;
                    }
                }
                System.out.println(sum);
            }
        } while (x != 0);
    }
}