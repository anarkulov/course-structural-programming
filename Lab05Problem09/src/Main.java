import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = scan.nextLine();


        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(String word) {
        int first = 0;
        int last = word.length() - 1;

        while (first < last) {
            if (word.charAt(first) != word.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}