package org.launchcode.techjobs.oo;

public class PositionType extends JobField {

    public PositionType(String aValue) {
        super(aValue);
    }
    @Override
    public String toString() {
        return getValue();
    }
}