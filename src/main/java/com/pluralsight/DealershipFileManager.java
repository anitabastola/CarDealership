package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DealershipFileManager {

    private static final String FILE_NAME = "inventory.csv";

    public Dealership getDealership() {
        Dealership dealership = null;
        ArrayList<Vehicle> inventory = new ArrayList<>();
        try {

            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            if ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("\\|");

                if (parts.length == 3) {
                    String name = parts[0];
                    String address = parts[1];
                    String phone = parts[2];
                    // dealership = new Dealership(name, address, phone);


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

    }

    }