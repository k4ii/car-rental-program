package com.rentacar.Model;

public class Branch {
    private int id;
    private String address;
    private boolean isRenting;

    public Branch() {
    }

    public Branch(String address, boolean isRenting) {
        this.address = address;
        this.isRenting = isRenting;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isRenting() {
        return isRenting;
    }

    public void setRenting(boolean renting) {
        isRenting = renting;
    }
}
