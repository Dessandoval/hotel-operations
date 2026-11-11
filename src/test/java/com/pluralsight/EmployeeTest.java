package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    //start at 0 hours, punch in at 10 and out at 14, and expect 4 hours
    @Test
    public void punchInAndOut_should_AddFourHours(){
        Employee employee = new Employee("42", "destiny", "Sales", 30.00, 0);
        double expectedHours = 4;
        employee.punchIn(10);
        employee.punchOut(14);
        assertEquals(expectedHours, employee.getHoursWorked());
    }
    //start at 8 hours, punch in at 13 and out at 15, and expect 10 hours. Leave out the versions that use the current time.
    @Test
    public void punchInAndOut_should_AddEightHours(){
        Employee employee = new Employee("42", "destiny", "Sales", 30.00, 8);
        double expectedHours = 10;
        employee.punchIn(13);
        employee.punchOut(15);
        assertEquals(expectedHours, employee.getHoursWorked());
    }

}