package com.driver;

public class Boat implements WaterVehicle{

    String name = "Boat";
    int capacity = 20;

    public String getVehicleName() {
        return name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }

    public static void main (String[] args) {
        Boat boat = new Boat();

        System.out.println(boat.getVehicleName());
        System.out.println(boat.getVehicleCapacity());
    }
}