public class Main {
    public static void main(String[] args) {

        double d = 0.1;
        double sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += d;
        }
        if (sum == 1.0) {
            System.out.println("Equal " + sum);
        } else {
            System.out.println("Not equal " + sum);
        }
        // correcting
        System.out.println("Correct way:");
        double sum1 = (float) sum;
        if (sum1 == 1.0) {
            System.out.println("Equal " + sum1);
        } else {
            System.out.println("Not equal " + sum1);
        }
    }
}