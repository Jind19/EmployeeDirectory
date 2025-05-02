package org.employeedirectory.datastructures;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


public class EmployeeDirectoryTest {

    @Test
    void testEmployeeDirectory() {
        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(101, "Alice");

        assertEquals("Alice", directory.getEmployee(101));
        assertTrue(directory.hasEmployee(101));
        assertNull(directory.getEmployee(999), "the employee id should not exist"); // non-existent ID
    }

}