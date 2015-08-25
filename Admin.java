package javabootcampweek3.SurvivalStore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Abram on 7/3/2015.
 */
public class Admin {

    private String password = "password";
    boolean login = false;
    Cart cart = new Cart();
    Scanner passwordAttempt = new Scanner(System.in);
    ListReader listReader = new ListReader();
    ArrayList<String> productList = listReader.readBufferedFile("C:\\Users\\Abram\\IdeaProjects\\HelloIntelliJ\\src\\javabootcampweek3\\ProductList.csv");
    BetterArray betterArray = new BetterArray();
    Inventory inventory = new Inventory(betterArray.transform(productList), cart);
    Scanner in = new Scanner(System.in);

    public void menu() {

        if (!login) {
            do {
                System.out.println("Password:  ");
            } while (!(passwordAttempt.nextLine().equals(password)));
            login = true;
        }

        System.out.println("ADMIN MENU");
        System.out.println("Choose option by entering its number");
        System.out.println("1 - List all products");
        System.out.println("2 - Search for product");
        System.out.println("3 - List purchased items");
        System.out.println("4 - List popular products");
        System.out.println("5 - Exit program");

        services();
    }

    public void services() {

        switch (in.nextLine()) {
            case "1":
                inventory.listProducts();
                break;
            case "2":
                search();
                break;
            case "3":
                listPurchasedItems();
                break;
            case "4":
                listPopularProducts();
                break;
            case "5":
                exit();
                break;
            default:
                break;
        }

        menu();
    }

    public void listProducts(ArrayList<Product> array){

        for (Product item : array) {
            System.out.print(item.getId() + "  ");
            System.out.print(item.getCategory() + "     ");
            System.out.print(item.getName() + "          ");
            System.out.print(item.getPrice() + "     ");
            System.out.println(item.getQuantity());
        }
    }

    public void search() {

    }

    public void listPurchasedItems() {

    }

    public void listPopularProducts() {

    }

    public void exit() {
        System.exit(0);
    }
}
