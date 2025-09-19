package abstractFactory;

public class NYPizzaStore extends PizzaStore{
    protected Pizza createPizza(String type)
    {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("cheese"))
        {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if (type.equals("veggie"))
        {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        else if (type.equals("clam"))
        {
            pizza = new ClamPizza(ingredientFactory);
        }
        return pizza;
    }

}
