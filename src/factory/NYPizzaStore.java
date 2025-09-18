package factory;

public class NYPizzaStore extends PizzaStore{

    public NYPizzaStore() {
    }

    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
