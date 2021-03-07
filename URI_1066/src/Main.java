import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pos = 0, neg = 0, even = 0, odd = 0;
        for (int i = 1; i <= 5; ++i) {
            int a = scan.nextInt();
            if (a > 0){
            pos += 1;
            } if (a < 0){
                neg += 1;
            } if (a % 2 == 0){
                even += 1;
            } if (a % 2 != 0){
                odd += 1;
            }
        }
        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}