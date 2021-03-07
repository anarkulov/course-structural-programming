import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int finish = 0, number = 1;

        while (finish != N){
            System.out.printf("%d %d %d PUM\n", number, (number + 1), (2 + number));
            number+=4;
            finish++;
        }
    }
}
