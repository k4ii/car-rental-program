package com.rentacar.Model;

public class Car {
    private int id;
    private String car_type;
    private String car_name;
    private int fuel_capacity;
    private int mileage;
    private int mpg;
    private boolean isAvailable;

    public Car() {
    }

    public Car(String car_type, String car_name, int fuel_capacity, int mileage, int mpg, boolean isAvailable) {
        this.car_type = car_type;
        this.car_name = car_name;
        this.fuel_capacity = fuel_capacity;
        this.mileage = mileage;
        this.mpg = mpg;
        this.isAvailable = isAvailable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public int getFuel_capacity() {
        return fuel_capacity;
    }

    public void setFuel_capacity(int fuel_capacity) {
        this.fuel_capacity = fuel_capacity;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
