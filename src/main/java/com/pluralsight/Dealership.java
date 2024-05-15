package com.pluralsight;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership() {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    public ArrayList<Vehicle> getInventory() {
        return inventory;
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return null;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return null;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public ArrayList<Vehicle> getAllVehicles() {
        return inventory;
    }

    public void addVehicle() {
    return;
    }

    public void removeVehicle() {

    }
}
