public class MexicanPizza implements BakePizza,PrepareDrinks {
    public void preparePizza(String pizzaType, String... toppings) {
        System.out.println("\tPreparing the " + pizzaType
                + " pizza in a Mexican style ...");
        System.out.println("\tPutting it into the oven ...");
        System.out.println("\tThe pizza is baked!");
        System.out.println("\tTake your pizza!\n");
    }

    public void prepareDrinks(String drinkType) {
        System.out.println("\tPreparing the " + drinkType
                + " drink in a Mexican style ...");
        System.out.println("\tPutting it into the cup ...");
        System.out.println("\tTake your drink!\n");
    }


}
