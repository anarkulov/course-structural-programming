public class Main {
    public static void main(String[] args) {
        int a = 1 + (int) (Math.random() * 52);
        int b = (int) (Math.random() * 4);

        String suit;
        String face;
        System.out.println(a+ "  " + b);
        if (a <= 6) {
            if (a % 2 == 0) {
                suit = "Clubs";
            } else {
                suit = "Diamonds";
            }
        } else {
            if (a % 2 == 0) {
                suit = "Hearts";
            } else {
                suit = "Spades";
            }
        }
        if (b == 0) {
                face = "Ace";
            } else if (b == 1) {
                face = "Jack";
            } else if (b == 2) {
                face = "Queen";
            } else {
                face = "King";
            }
            if (a > 1 && a <= 10) {
                System.out.printf("The card picked is %s of %s\n", a, suit);
                return;
            }
            System.out.printf("The card picked is %s of %s\n", face, suit);
        }
    }
