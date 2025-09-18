package factory;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza()
    {
        name = "Chicago Style Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    void cut()
    {
        System.out.println("Cutting the pizza into square slices");
    }
}
