import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] list = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++){
            list[i] = scan.nextInt();
        }
        int newList[] = eliminateDuplicates(list);
        System.out.print("The distinct numbers are: ");
        for (int e: newList){
            if (e > 0){
                System.out.print(" " + e);
            }
        }
        System.out.println();

    }
    public static int[] eliminateDuplicates(int[] list){
        int[] newList = new int[list.length];
        int i = 0;
        for (int e: list){
            if (linearSearch(newList, e) == -1) {
                newList[i] = e;
                i++;
            }
        }
        return newList;
    }

    public static int linearSearch(int[] array, int key){
        for (int i = 0; i < array.length; i++){
            if (key == array[i]){
                return i;
            }
        }
        return -1;
    }
}
