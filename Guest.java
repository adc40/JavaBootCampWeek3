package javabootcampweek3.SurvivalStore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Abram on 7/3/2015.
 */
public class Guest {

    Wallet wallet = new Wallet();
    Cart cart = new Cart();
    ListReader listReader = new ListReader();
    ArrayList<String> productList = listReader.readBufferedFile("C:\\Users\\Abram\\IdeaProjects\\HelloIntelliJ\\src\\javabootcampweek3\\ProductList.csv");
    BetterArray betterArray = new BetterArray();
    Inventory inventory = new Inventory(betterArray.transform(productList), cart);
    Scanner in = new Scanner(System.in);
    String userInput;

    public void menu(){

        System.out.println("GUEST MENU");
        System.out.println("Choose option by entering its number:");
        System.out.println("1 - Shop");
        System.out.println("2 - View shopping cart");
        System.out.println("3 - View wallet");
        System.out.println("4 - Checkout");
        System.out.println("5 - Exit program");

        services();

    }

    public void services() {

        userInput = in.nextLine();

        switch (userInput) {
            case "1":
                inventory.shop();
                break;
            case "2":
                cart.viewCart();
                break;
            case "3":
                System.out.println(wallet.getBalance());
                break;
            case "4":
                wallet.setBalance(wallet.spendMoney(cart.totalCost()));
                cart.empty();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                break;
        }

        menu();

    }

}
