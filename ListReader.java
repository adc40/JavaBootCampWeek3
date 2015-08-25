package javabootcampweek3.SurvivalStore;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Abram on 7/2/2015.
 */
public class ListReader {

    public ArrayList<String> readBufferedFile(String fileLocation) {

        ArrayList<String> inventory = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(fileLocation);
            BufferedReader reader = new BufferedReader(fileReader);

            String streamLine;

            while((streamLine = reader.readLine()) != null){
                inventory.add(streamLine);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found at location " + fileLocation);
        } catch (IOException e) {
            System.out.println("File contains no readable data!");
        }

        return inventory;
    }
}
