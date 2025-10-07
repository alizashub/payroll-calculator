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

            // Skip the header line (if your CSV has one)
            bufferedReader.readLine();

            String line;

            while ((line = bufferedReader.readLine()) != null) {

                // Split the line using the | symbol
                String[] parts = line.split("\\|");

                // Store each value in a variable
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double hoursWorked = Double.parseDouble(parts[2]);
                double payRate = Double.parseDouble(parts[3]);

                // Create an Employee object
                Employee employee = new Employee(id, name, hoursWorked, payRate);

                // Print the employee info
                System.out.println(employee.getEmployeeId() + " | " + employee.getName() + " | " + employee.getGrossPay());
            }

            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}