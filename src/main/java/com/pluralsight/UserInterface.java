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
                  //  processGetbyVehicleRequest();
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
            double minPrice = scanner.nextDouble();
            System.out.println("Please enter the maximum price ");
            double maxPrice = scanner.nextDouble();

            List<Vehicle> inventory = dealership.getVehiclesByPrice(minPrice, maxPrice);


    }

    public void processGetByMakeModelRequest() {
        System.out.println("Please enter your make vehicle ");
      String make = scanner.nextLine();
        System.out.println("Please enter the model of vehicle ");
        String model = scanner.nextLine();
        List<Vehicle> inventory = dealership.getVehiclesbyMakeModel(make, model);

    }

    public void processGetbyYearRequest() {
        System.out.println("Please enter the year from");
        Double fromYear = Double.parseDouble(scanner.next();
        scanner.nextLine();
        System.out.println("Please enter the year to ");
        Double toYear = Double.parseDouble(scanner.next());
        List<Vehicle> inventory = dealership.getAllVehicles(fromYear, toYear);
        displayVehicle(inventory);
    }

    public void processGetbyColorRequest() {
        System.out.println("Please enter your color of the vehicle ");
        String color = scanner.nextLine();
        List<Vehicle> inventory = dealership.getVehicleByColor(color);
        displayVehicle(inventory);


    }
    public void processGetbyMileageRequest() {
        System.out.println("Please enter the minimum mileage of your vehicle");
        double minMileage = Double.parseDouble(scanner.nextLine());
        System.out.println("Please enter the maximum mileage of your vehicle");
        double maxMileage = Double.parseDouble(scanner.nextLine());
        List<Vehicle> inventory = dealership.(minMileage, maxMileage);
        displayVehicle(inventory);

    }

    public void processGetbyVehicleTypeRequest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of vehicle ");
        String type = scanner.nextLine();

        List<Vehicle> inventory = dealership.getVehicleByType(type);
        displayVehicle(inventory);
    }
    public void processGetAllVehicleRequest() {
        List<Vehicle> inventory = dealership.getAllVehicles();
        displayVehicle(inventory);
    }
    public void processAddVehicleRequest() {
        Scanner scanner = new Scanner(System.in);
        int vin = Integer.parseInt(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter make of vehicle");
        String make = scanner.nextLine();
        System.out.println("Enter model of veicle");
        String model = scanner.nextLine();
        System.out.println("Enter veicle type ");
        String type = scanner.nextLine();
        String color = scanner.nextLine();
        System.out.println("Enter odometer");
        int odometer = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter price");
        double price = Double.parseDouble(scanner.nextLine());

        dealership.addVehicle(new Vehicle(vin, year, make, model, type, color, odometer, price));
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealershipFileManager.saveDealership(dealership);
        System.out.println("Vehicle added");

    }
    public void processRemoveVehicleRequest() {
        System.out.println("Enter VIN of vehicle ");
        int vin = scanner.nextInt();
        ;
      //  dealership.removeVehicle(vin);
        DealershipFileManager dealershipFileManager = new DealershipFileManager();
        dealershipFileManager.getDealership().removeVehicle();
        System.out.println("vin + " );


    }

}
