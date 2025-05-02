package org.employeedirectory;

import java.util.HashSet;

public class GuestList {
    private HashSet<String> guests;

    public GuestList() {
        this.guests = new HashSet<>();
    }

    public boolean addGuests(String name){
        return guests.add(name);
    }

    public boolean isInvited(String name){
        return guests.contains(name);
    }

    public int totalGuests(){
        return guests.size();
    }

    public boolean addGuest(String name) {
        return guests.add(name);
    }
}
