import java.util.Arrays;

public class CaliforniaPizza implements BakePizza  {


    public void preparePizza(String pizzaType, String... toppings) {
        System.out.println("\tPreparing the " + pizzaType + " pizza in a California style ... with toppings: " + Arrays.toString(toppings));
        System.out.println("\tPutting it into the oven ...");
        System.out.println("\tThe pizza is baked!");
        System.out.println("\tTake your pizza!\n");
    }
}
