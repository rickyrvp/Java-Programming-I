import java.util.Scanner;


public class LastCharacter {
    public static char lastCharacter(String text) {
        char last = text.charAt(text.length() - 1);
        return last;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        System.out.println("Last character: " + lastCharacter(name));
    }
}
