package com.pluralsight;

public class App {
    public static void main(String[] args) {

        System.out.println("=== Room ===\n");
        Room room1 = new Room(2, 124.00, false, false);
        System.out.println("Clean room: " + room1.isAvailable());

        Room room2 = new Room(1, 125.00, false, true);
        System.out.println("Dirty room: " + room2.isDirty());

        Room room3 = new Room(2, 285.00, true, false);
        System.out.println("Occupied Room: " + room3.isOccupied());

        System.out.println("=== Reservation ===\n");

        Reservation reservation = new Reservation("King", 3, true);
        System.out.printf("Price per night: $%.2f%n", reservation.getPrice());
        System.out.printf("Total reservation: $%.2f%n", reservation.getReservationTotal());

        System.out.println("=== Employee ===\n");

//         Test it at $20.00 an hour. 20 hours is 20 regular, 0 overtime, $400.00
        Employee employee1 = new Employee("123982", "Alice", "Sales", 20.00, 20.0);
//         Test Employee 2: 45 hours at $20.00/hr -> Expected: $950.00
        Employee employee2 = new Employee("8725102", "Lily", "Engineering", 20.00, 45.0);

        System.out.println("Employee ID: " + employee1.getEmployeeId());
        System.out.println("Employee Name: " + employee1.getName());
        System.out.println("Regular Hours: " + employee1.getRegularHours());
        System.out.println("Overtime Hours: " + employee1.getOvertimeHours());
        System.out.printf("Total Pay: $%.2f%n", employee1.getTotalPay());

        System.out.println("Employee ID: " + employee2.getEmployeeId());
        System.out.println("Employee Name: " + employee2.getName());
        System.out.println("Regular Hours: " + employee2.getRegularHours());
        System.out.println("Overtime Hours: " + employee2.getOvertimeHours());
        System.out.printf("Total Pay: $%.2f%n", employee2.getTotalPay());

        System.out.println("=== CHECK IN ===\n");
        room1.checkIn();
        System.out.println("After check in: " + room1.isAvailable());

        room1.checkOut();
        System.out.println("After check out: " + room1.isAvailable());

        room1.cleanRoom();
        System.out.println("After cleaning: " + room1.isAvailable());

        System.out.println("=== Punch In ====\n ");
        Employee employee3 = new Employee("123965482", "Joe", "Sales", 20.00, 20.0);
        employee3.punchIn(10);
        employee3.punchOut(14); // should go up 4 hours

        System.out.println("After Shift: " + employee3.getHoursWorked());
    }
}
