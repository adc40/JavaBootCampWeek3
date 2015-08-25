package javabootcampweek3.SurvivalStore;

import java.util.ArrayList;

/**
 * Created by Abram on 7/3/2015.
 */
public class Cart {

    ArrayList<Product> cart = new ArrayList<>();

    public ArrayList<Product> add(Product item) {
        cart.add(item);
        return cart;
    }

    public void empty() {
        for (int i = 0; i < cart.size(); i++) {
            cart.remove(i);
        }
    }

    public void viewCart() {
        if (cart.size() == 0) {
            System.out.println("Nothing in cart.");
        } else {
            for (Product item : cart) {
                System.out.println(item.getName());
                System.out.println(item.getPrice());
            }
        }
    }

    public double totalCost() {
        double sum = 0;
        for(Product item : cart){
            sum = sum + item.getPrice();
        }
        return sum;
    }

}
