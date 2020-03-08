
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        int result = 0;
        int i = 0;

        while (first <= last) {
            result += first;
            first++;
        }
        System.out.println(result);
    }
}
