public class GreekPizza implements BakePizza {


    public void preparePizza(String pizzaType, String... toppings) {
        System.out.println("\tPreparing the " + pizzaType + " pizza in a Greek style ...");
        System.out.println("\tPutting it into the oven ...");
        System.out.println("\tThe pizza is baked!");
        System.out.println("\tTake your pizza!\n");
    }
}
