package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/main/resources/employees.csv"); // for reading the file
            BufferedReader bufferedReader = new BufferedReader(fileReader);


            bufferedReader.readLine(); // to skip the header line in cvs file

            String line;

            // read each line, one by one, in a loop
            while ((line = bufferedReader.readLine()) != null) { // read each line in a loop

                // Split the line using the | symbol into smaller strings
                String[] parts = line.split("\\|");

                // Store each value in a variable
                int id = Integer.parseInt(parts[0]); // converting the string into an int, setting index to 0
                String name = parts[1]; // setting index to 1
                double hoursWorked = Double.parseDouble(parts[2]); // converting string into double, setting index to 2
                double payRate = Double.parseDouble(parts[3]); // converting string into double, setting index to 3

                // Create an Employee object
                Employee employee = new Employee(id, name, hoursWorked, payRate); // setting the constructor

                // Print the employee info
                System.out.printf("%d | %s | %.2f%n", employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}