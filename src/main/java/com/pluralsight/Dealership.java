package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        List<Vehicle> inventory

    }

    public List<Vehicle> getVehiclesByPrice(double min, double max){
        return null;
    }
    public List<Vehicle> getVehiclesbyMakeModel (String make, String Model){
        return null;
    }

    public List<Vehicle> getVehiclebyYear(double min, double max) {
        return null;
    }
    public List<Vehicle> getVehicleByColor (String color){
        return null;

    }
    public ArrayList<Vehicle> getAllVehicles() {
        return null;
    }

    public List<Vehicle> getVehicleByType (String vehicleType) {
        return null;
    }

    public void addVehicle(Vehicle vehicle) {

    }

    public void removeVehicle(Vehicle vehicle) {
    }
}
