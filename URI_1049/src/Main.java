import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();

        if (a.equals("vertebrado") && b.equals("ave") && c.equals("carnivoro")) {
            System.out.println("aguia");
        }else if (a.equals("vertebrado") && b.equals("ave") && c.equals("onivoro")) {
            System.out.println("pomba");
        }else if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("onivoro")) {
            System.out.println("homem");
        }else if (a.equals("vertebrado") && b.equals("mamifero") && c.equals("herbivoro")) {
            System.out.println("vaca");
        }else if (a.equals("invertebrado") && b.equals("inseto") && c.equals("hematofago")) {
            System.out.println("pulga");
        }else if (a.equals("invertebrado") && b.equals("inseto") && c.equals("herbivoro")) {
            System.out.println("lagarta");
        }else if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("hematofago")) {
            System.out.println("sanguessuga");
        }else if (a.equals("invertebrado") && b.equals("anelideo") && c.equals("onivoro")) {
            System.out.println("minhoca");
        }
    }
}