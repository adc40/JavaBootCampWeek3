package javabootcampweek3.SurvivalStore;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Abram on 6/30/2015.
 */
public class Store {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String userInput;

        do {
            System.out.println("Enter 1 to log in as Guest, or 2 to log in as Admin.");
            userInput = in.nextLine();
            //TODO: better way of verifying user input
            if (userInput.equals("1")) {
                Guest guest = new Guest();
                guest.menu();
            } else if (userInput.equals("2")) {
                Admin admin = new Admin();
                admin.menu();
            }
        } while (!(userInput.equals("1")) && !(userInput.equals("2")));


    }


}
