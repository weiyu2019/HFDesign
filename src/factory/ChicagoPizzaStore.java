package factory;

public class ChicagoPizzaStore extends PizzaStore{
    public ChicagoPizzaStore() {
    }

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
