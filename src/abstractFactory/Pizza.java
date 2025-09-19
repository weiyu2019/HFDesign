package abstractFactory;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies veggies[];
    Pepperoni pepperoni;
    Clams clam;

    abstract void prepare();

    void bake()
    {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut()
    {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box()
    {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name)
    {
        this.name = name;
    }

    String getName()
    {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        display.append(cheese + "\n");
        for (int i = 0; i < veggies.length; i++) {
            display.append(veggies[i] + "\n");
        }
        display.append(pepperoni + "\n");
        display.append(clam + "\n");
        return display.toString();
    }
}
