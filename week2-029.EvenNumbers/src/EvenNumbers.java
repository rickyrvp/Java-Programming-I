
public class EvenNumbers {

    public static void main(String[] args) {
        // Write your code here
      int number = 2;
      while (number <= 100 && number % 2 == 0) {
          System.out.println(number);
          number = number + 2;
      }
    }
}
