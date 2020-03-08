import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BirdWatch deck = new BirdWatch(input);

        while (true) {
            System.out.print("? ");
            String command = input.nextLine();

            if (command.equals("Quit")) {
                break;
            } else {
                UserChoice(input, command, deck);
            }
        }
    }

    public static void UserChoice(Scanner input, String command, BirdWatch deck) {

        if (command.equals("Add")) {
            deck.Add(input);
        } else if (command.equals("Observation")) {
            deck.Observation(input);
        } else if (command.equals("Show")) {
            deck.Show(input);
        } else if (command.equals("Statistics")) {
            deck.Statistics();
        } else {
            System.out.println("Your input did not match a command. Try again!");
        }
    }
}