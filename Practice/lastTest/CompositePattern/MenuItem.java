package lastTest.CompositePattern;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;
    public MenuItem(String name, String description, boolean vegetrian, double price){
        this.description = description;
        this.name = name;
        this.vegetarian = vegetrian;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
