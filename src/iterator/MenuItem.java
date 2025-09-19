package iterator;

import java.util.ArrayList;
import java.util.List;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;
    List<MenuItem> menuItems = new ArrayList<>();

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public double getPrice() {
        return price;
    }
}
