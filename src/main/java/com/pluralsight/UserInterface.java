package com.pluralsight;

import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private final Scanner scanner;

    public UserInterface(Dealership dealership, Scanner scanner) {
        this.dealership = dealership;
        this.scanner = scanner;
    }

    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();
    }

        public void displayVehicle(List <Vehicle> inventory) {
            for (Vehicle vehicle : inventory) {
                System.out.println(vehicle);
            }

        boolean running = true;

        while (running) {

            System.out.println("Welcome to our Car Dealership ");
            System.out.println("Please Choose an option: ");
            System.out.println("1) Look up vehicles by price ");
            System.out.println("2) Look up vehicles by make/model ");
            System.out.println("3) Look up vehicles by year ");
            System.out.println("4) Look up vehicles by color ");
            System.out.println("5) Look up vehicles by mileage");
            System.out.println("6) Look up vehicles by type");
            System.out.println("7) Look up ALL vehicles  ");
            System.out.println("8) Add vehicle ");
            System.out.println("9) Remove vehicle ");
            System.out.println("0) Exit");

            String input = scanner.nextLine().trim();

            switch (input.toUpperCase()) {
                case "1":
                    processGetByPriceRequest();
                    break;
                case "2":
                    processGetByMakeModelRequest();
                    break;
                case "3":
                    processGetbyYearRequest();
                    break;
                case "4":
                    processGetbyColorRequest();
                    break;
                case "5":
                    processGetbyMileageRequest();
                    break;
                case "6":
                    processGetbyVehicleRequest();
                    break;
                case "7":
                    processGetAllVehicleRequest();
                    break;
                case "8":
                    processAddVehicleRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                default:
                    System.out.println("Invalid, try again");
                    break;

            }


                }

            }



        public void processGetByPriceRequest() {
        System.out.println("Please enter your minimum price ");
        Scanner scanner = new Scanner(System.in);


    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetbyYearRequest() {

    }

    public void processGetbyColorRequest() {

    }
    public void processGetbyMileageRequest() {

    }
    public void processGetbyVehicleRequest() {

    }
    public void processGetAllVehicleRequest() {
        List<Vehicle> inventory = dealership.getAllVehicles();
        displayVehicle(inventory);
    }
    public void processAddVehicleRequest() {

    }
    public void processRemoveVehicleRequest() {


    }

}
