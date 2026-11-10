package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public Hotel(int numberOfSuites, int numberOfRooms, String name) {
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.name = name;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public int getAvailableSuites() {
        return this.numberOfSuites - this.bookedSuites;
    }

    public int getAvailableRooms() {
        return this.numberOfRooms - this.bookedBasicRooms;
    }

    public boolean bookRoom(int roomCount, boolean suite) {
        if (suite) {
            if (roomCount <= getAvailableSuites()) {
                this.bookedSuites += roomCount;
                return true;
            }
        } else {
            if (roomCount <= getAvailableRooms()) {
                this.bookedBasicRooms += roomCount;
                return true;
            }
        }
        return false;
    }

}
