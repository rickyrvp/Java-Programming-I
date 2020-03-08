import java.util.Scanner;

public class FirstCharacter {

    public static char firstCharacter(String text) {
        char first = text.charAt(0);
        return first;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println("First character: " + firstCharacter(name));
    }
}
