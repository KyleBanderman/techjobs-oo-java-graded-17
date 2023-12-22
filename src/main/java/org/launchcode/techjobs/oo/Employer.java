package org.launchcode.techjobs.oo;

public class Employer extends JobField {

    public Employer(String aValue) {
        super(aValue);
    }
    @Override
    public String toString() {
        return getValue();
    }
}
