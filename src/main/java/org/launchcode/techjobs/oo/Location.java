package org.launchcode.techjobs.oo;

public class Location extends JobField {

    public Location(String aValue) {
        super(aValue);
    }
    @Override
    public String toString() {
        return getValue();
    }
}