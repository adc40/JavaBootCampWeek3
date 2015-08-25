package javabootcampweek3.SurvivalStore;

/**
 * Created by Abram on 7/2/2015.
 */
public class Product {

    String category;
    String name;
    double price;
    int quantity;
    int id = 0;

    public Product (String category, String name, double price, int quantity, int id) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = id;

    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }

}
