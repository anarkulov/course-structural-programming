import java.util.Scanner;

public class Main {
    public static int abs(int number) {
        return (number < 0) ? -number : number;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Your coordinate? ");
        int coordinate = scan.nextInt();

        System.out.print("First point? ");
        int point1 = scan.nextInt();

        System.out.print("Second point? ");
        int point2 = scan.nextInt();

        int distance1 = abs(coordinate - point1);
        int distance2 = abs(coordinate - point2);

        if (distance1 < distance2) {
            System.out.println("The 1st point is the closest one. " +
                                "The distance is " + distance1);
        } else if (distance1 > distance2) {
            System.out.println("The 2nd point is the closest one. " +
                                "The distance is " + distance2);
        } else {
            System.out.printf(" The distance %d for two points is the same\n ", distance1);
        }
    }
}
