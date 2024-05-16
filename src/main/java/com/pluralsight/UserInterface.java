package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private final Scanner scanner;

    public UserInterface(Dealership dealership, Scanner scanner) {
        this.dealership = dealership;
        this.scanner = scanner;
       // Scanner scanner = new Scanner(System.in);
    }
    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();
    }
    public void display() {
        boolean running = true;
        while (running) {

            System.out.println("Welcome to TransactionApp");
            System.out.println("Choose an option:");
            System.out.println("D) Add Deposit");
            System.out.println("P) Make Payment (Debit)");
            System.out.println("L) Ledger");
            System.out.println("X) Exit");

            String input = scanner.nextLine().trim();

                }

            }





    public void processGetByPriceRequest() {
        System.out.println("Please enter your minimum price ");

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

    }
    public void processAddVehicleRequest() {

    }
    public void processRemoveVehicleRequest() {


    }

}
