package javabootcampweek3.SurvivalStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by Abram on 7/3/2015.
 */
public class Inventory {

    ArrayList<Product> inventory = new ArrayList<>();
    Cart cart = new Cart();
    String userInput;

    public Inventory () {

    }

    public Inventory (ArrayList<Product> inventory, Cart cart) {
        this.inventory = inventory;
        this.cart = cart;
    }

    public void shop() {

        Scanner input = new Scanner(System.in);
        System.out.println("Shop how? ");
        System.out.println("1 - List products by category");
        System.out.println("2 - List products by name");
        System.out.println("3 - List products by price");
        System.out.println("4 - List all products");
        userInput = input.nextLine();

        switch (userInput) {
            case "1":
                listProductsByCategory();
                break;
            case "2":
                listProductsByName();
                break;
            case "3":
                listProductsByPrice();
                break;
            case "4":
                listProducts();
                break;
        }

        do {
            System.out.println("Enter product id to add to cart, or 0 for previous menu:  ");
            userInput = input.nextLine();
            if(!userInput.equals("0")){
                for(Product item : inventory) {
                    if(item.getId() == Integer.valueOf(userInput)) {
                        cart.add(item);
                        System.out.println("Added to cart");
                    }
                }
            }
        } while (!userInput.equals("0"));
    }

    public void listProducts(){

        for (Product item : inventory) {
            System.out.print(item.getId() + "  ");
            System.out.print(item.getCategory() + "     ");
            System.out.print(item.getName() + "          ");
            System.out.print(item.getPrice() + "     ");
            System.out.println(item.getQuantity());
        }
    }

    public void listProductsByCategory(){

        Collections.sort(inventory, new CategoryComparator());

        for (Product item : inventory) {
            System.out.print(item.getId() + "  ");
            System.out.print(item.getCategory() + "     ");
            System.out.print(item.getName() + "          ");
            System.out.print(item.getPrice() + "     ");
            System.out.println(item.getQuantity());
        }

    }

    public void listProductsByName(){

        Collections.sort(inventory, new NameComparator());

        for (Product item : inventory) {
            System.out.print(item.getId() + "  ");
            System.out.print(item.getCategory() + "     ");
            System.out.print(item.getName() + "          ");
            System.out.print(item.getPrice() + "     ");
            System.out.println(item.getQuantity());
        }

    }

    public void listProductsByPrice(){

        Collections.sort(inventory, new PriceComparator());

        for (Product item : inventory) {
            System.out.print(item.getId() + "  ");
            System.out.print(item.getCategory() + "     ");
            System.out.print(item.getName() + "          ");
            System.out.print(item.getPrice() + "     ");
            System.out.println(item.getQuantity());
        }

    }

    class NameComparator implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    }

    class CategoryComparator implements Comparator<Product> {
        @Override
        public int compare(Product o1, Product o2) {
            return o1.getCategory().compareToIgnoreCase(o2.getCategory());
        }
    }

    class PriceComparator implements Comparator<Product>{
        @Override
        public int compare(Product o1, Product o2) {
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            }
            return -1;
        }
    }
}