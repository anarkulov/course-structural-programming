import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        do {
            x = scan.nextInt();
            if (x == 2002) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("Senha Invalida");
            }

        } while (x != 2002) ;
    }
}