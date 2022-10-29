import static java.lang.System.*;

public class MainApp {
    public static void main(String[] args) {
        Food pizza = new Pizza();
        Food burger = new Burger();
       Chef pizzaChef = new Chef(pizza);
       Chef burgerChef = new Chef(burger);
       pizzaChef.makeFood();
       out.println(pizza.priceCalculator(10) + " Euro");
       burgerChef.makeFood();
        out.println(burger.priceCalculator(-12) + " Euro");
    }
}
