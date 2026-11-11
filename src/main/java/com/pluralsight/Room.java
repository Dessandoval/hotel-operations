package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = isOccupied;
        this.dirty = isDirty;
    }
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }
    public boolean checkIn() {
        if (isAvailable()){
            this.occupied = true;
            this.dirty = true;
            return true;
        } else {
            return false;
        }
    }

    public void checkOut() {
        this.occupied = false;
    }

    public boolean cleanRoom() {
        if (!isOccupied()){
            this.dirty = false;
            return true;
        } else {
            return false;
        }
    }

}
