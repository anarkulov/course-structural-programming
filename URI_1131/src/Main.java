import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inter = 0, gremio = 0, empates = 0;
        int x, y, finish, counter;

        do {
                x = scan.nextInt();
                y = scan.nextInt();
                if (x > y) {
                    inter++;
                } else if (y > x) {
                    gremio++;
                } else {
                    empates++;
                }
            System.out.println("Novo grenal (1-sim 2-nao)");
            finish = scan.nextInt();

        } while (finish != 2);
        counter = inter + gremio + empates;
        System.out.println(counter + " grenais");
        System.out.println("Inter:" + inter);
        System.out.println("Gremio:" + gremio);
        System.out.println("Empates:" + empates);

        if (inter > gremio) {
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Gremio venceu mais");
        }
    }
}