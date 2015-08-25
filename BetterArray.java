package javabootcampweek3.SurvivalStore;

import java.util.ArrayList;

/**
 * Created by Abram on 7/3/2015.
 */
public class BetterArray {

    public ArrayList<Product> transform (ArrayList<String> arrayList) {

        String[] line;
        double price;
        int quantity;
        int counter = 0;
        int length = arrayList.size();
        ArrayList<Product> betterArray = new ArrayList<>();

        for (int i = 0; i < length; i++) {
            line = arrayList.get(i).replace("$", "").replace("\"", "").split(",");
            if (line.length == 5) {
                price = ((Double.parseDouble(line[2])) * 1000) + Double.parseDouble(line[3]);
                quantity = Integer.valueOf(line[4]);
            } else {
                price = Double.parseDouble(line[2]);
                quantity = Integer.valueOf(line[3]);
            }
            ++counter;
            Product product = new Product(line[0], line[1], price, quantity, counter);
            betterArray.add(product);
        }

        return betterArray;
    }
}
