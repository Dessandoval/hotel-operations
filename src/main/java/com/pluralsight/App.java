package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Room room1 = new Room(2, 124.00, false, false);
        System.out.println("Clean room: " + room1.isAvailable());

        Room room2 = new Room(1, 125.00, true, false);
        System.out.println("Dirty room: " + room2.isDirty());

        Room room3 = new Room(2, 285.00, true, false);
        System.out.println("Occupied Room: " + room3.isOccupied());

        Reservation reservation = new Reservation("King", 3, true);
        System.out.printf("Price per night: $%.2f%n", reservation.getPrice());
        System.out.printf("Total reservation: $%.2f%n", reservation.getReservationTotal());




    }
}
