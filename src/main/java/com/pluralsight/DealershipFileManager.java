package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {

    private static final String FILE_NAME = "dealership.csv";

    public Dealership getDealership() {
        Dealership dealership = null;
        ArrayList<Vehicle> inventory = new ArrayList<>();
        try {

            FileReader fileReader = new FileReader("dealership.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            bufferedReader.close();

            if ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length == 3) {
                    String name = parts[0];
                    String address = parts[1];
                    String phone = parts[2];
                    dealership = new Dealership(name, address, phone);


                }

                if (parts.length == 8) {

                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2].trim();
                    String model = parts[3];
                    String type = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);
                    Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);
                    inventory.add(vehicle);
                }

                if (dealership != null) {
                    Dealership getAllVehicles = dealership;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Error loading inventory: " + e.getMessage());
        } catch (IOException e) {

            return null;
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership) {
        try {
            FileReader fileWriter = new FileReader("dealership.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dealership.csv"));
            try {
                bufferedWriter.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone());
                bufferedWriter.newLine();

                List<Vehicle> inventory = getDealership().getInventory(); //check
                for (Vehicle vehicle : inventory) {
                    bufferedWriter.write(vehicle.toString());
                    bufferedWriter.newLine();
                    bufferedWriter.close();

                }


            } catch (Exception e) {

                System.out.println("Error with save dealership: " + e.getMessage());

                bufferedWriter.close();

            }

        } catch (IOException e) {
            System.out.println("Error dealership info: " + e.getMessage());

        }
    }
}