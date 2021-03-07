import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < 10; i++){
            numbers[i] = scan.nextDouble();
        }

        System.out.printf("The minimum number is %.2f and it's index is %d",
                numbers[indexOfSmallestElement(numbers)],
                indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array){

        double min = array[0];
        int indOfMin = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
                indOfMin = i;
            }
        }
        return indOfMin;
    }
}
