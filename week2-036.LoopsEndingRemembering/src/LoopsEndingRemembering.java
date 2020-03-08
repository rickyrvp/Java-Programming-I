import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        int sum = 0;
        int numberCount = 0;
        int even = 0;
        int odd = 0;
        double average;

        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            System.out.println(number);

            if (number == -1) {
                break;
            }
            sum += number;
            numberCount++;

            if (number % 2 == 0) {
            even++;
            } else {
                odd++;
            }

        }
        average = (double)sum / numberCount;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + numberCount);
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}