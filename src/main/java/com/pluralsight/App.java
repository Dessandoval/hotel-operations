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

//         Test it at $20.00 an hour. 20 hours is 20 regular, 0 overtime, $400.00
        Employee employee1 = new Employee("123982", "Alice", "Sales", 20.0, 20.00);
//         Test Employee 2: 45 hours at $20.00/hr -> Expected: $950.00
        Employee employee2 = new Employee("8725102", "Lily", "Engineering", 45.0, 20.00);


        System.out.println("Employee ID: " + employee1.getEmployeeId());
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Regular Hours: " + employee1.getRegularHours());
        System.out.println("Overtime Hours: " + employee1.getOvertimeHours());
        System.out.println("Total Pay: $" + employee1.getTotalPay());

        System.out.println("Employee ID: " + employee2.getEmployeeId());
        System.out.println("Employee Name: " + employee2.getName());
        System.out.println("Regular Hours: " + employee2.getRegularHours());
        System.out.println("Overtime Hours: " + employee2.getOvertimeHours());
        System.out.println("Total Pay: $" + employee2.getTotalPay());
    }
}
