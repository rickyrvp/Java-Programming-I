
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // adds a new meal to the list
    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    // prints the meals in a menu
    public void printMeals() {
        for (String meal : meals)
        System.out.println(meal);
    }

    // clears a menu
    public void clearMenu() {
        this.meals.removeAll(meals);


    }
}
