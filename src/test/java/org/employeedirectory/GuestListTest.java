package org.employeedirectory;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GuestListTest {
    @Test
    void testGuestList() {
        GuestList guestList = new GuestList();
        guestList.addGuest("Bob");
        guestList.addGuest("Alice");
        boolean flag = guestList.addGuest("Bob"); // duplicate

        assertEquals(2, guestList.totalGuests());
        assertTrue(guestList.isInvited("Bob"));
        assertFalse(guestList.isInvited("Charlie"));
        assertFalse(flag); // HashSet has only unique values
    }

}