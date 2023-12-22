package org.launchcode.techjobs.oo;

public class CoreCompetency extends JobField {

    public CoreCompetency(String aValue) {
        super(aValue);
    }
    @Override
    public String toString() {
        return getValue();
    }
}