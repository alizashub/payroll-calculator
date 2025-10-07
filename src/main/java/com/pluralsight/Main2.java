package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String input;
            while ((input = bufferedReader.readLine()) !=null ) {
                System.out.println(input);
            }

















        } catch (FileNotFoundException e) {
            System.out.println("Could not find this : " + e);
        } catch (IOException e) {
            System.out.println( "Some IO exception I don't understand but here it is: " + e );
        }


    }
}
