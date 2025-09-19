package abstractFactory;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String var1);

    public Pizza orderPizza(String type) {
        Pizza pizza = this.createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
