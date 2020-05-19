import java.util.Arrays;

public class PizzaVendingMachine {

    public void giveMePizza() {

    // Make it simple, assume only 3 toppings
    String[] toppings = new String[]{"Onion", "Tomato", "Capscicum"};
    String pizzaType = "Thick Crust";


    // First customer orders Greek Thick Crust pizza
        System.out.println("Customer ordered "
                + "Greek Thick Crust Pizza");

    BakePizza bakePizza = new GreekPizza();
        bakePizza.preparePizza(pizzaType,toppings);

    // The next customer orders California Thick Crust pizza
        System.out.println("Customer ordered "
                + "California Thick Crust Pizza");
    BakePizza californiaPizza = new CaliforniaPizza();
        californiaPizza.preparePizza(pizzaType, toppings);

    // Initialise to serve Coke by default
    String choiceOfDrink = "Pink Lemonade";

    // The third customer orders Mexican Thick Crust pizza
    // and a pink lemonade
        System.out.println("Customer ordered Mexican "
                + "Thick Crust Pizza and a Pink Lemonade");
    BakePizza mexicanPizza = new MexicanPizza();
        mexicanPizza.preparePizza(pizzaType, toppings);

    PrepareDrinks prepareDrinks =  new MexicanPizza();
        prepareDrinks.prepareDrinks(choiceOfDrink);
}

    public static void main(String[] args) {
        PizzaVendingMachine vendingMachine = new PizzaVendingMachine();
        vendingMachine.giveMePizza();
    }
}

