package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job () {
        this.id = nextId;
        nextId++;
    }

    public Job (String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        name = aName;
        employer = aEmployer;
        location = aLocation;
        positionType = aPositionType;
        coreCompetency = aCoreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String output = System.lineSeparator() + "ID: " + this.id;
        if (this.name == null || this.name.isEmpty()) {
            output += System.lineSeparator() + "Name: Data not Available";
        } else {
            output += System.lineSeparator() + "Name: " + this.name;
        }
        if (this.employer == null || this.employer.getValue().isEmpty()) {
            output += System.lineSeparator() + "Employer: Data not Available";
        } else {
            output += System.lineSeparator() + "Employer: "  + this.employer.getValue();
        }
        if (this.location == null || this.location.getValue().isEmpty()) {
            output += System.lineSeparator() + "Location: Data not Available";
        } else {
            output += System.lineSeparator() + "Location: " + this.location.getValue();
        }
        if (this.positionType == null || this.positionType.getValue().isEmpty()) {
            output += System.lineSeparator() + "Position Type: Data not Available";
        } else {
            output += System.lineSeparator() + "Position Type: " + this.positionType.getValue();
        }
        if (this.coreCompetency == null || this.coreCompetency.getValue().isEmpty()) {
            output += System.lineSeparator() + "Core Competency: Data not Available";
        } else {
            output += System.lineSeparator() + "Core Competency: " + this.coreCompetency.getValue();
        }
        return output;
    }
    /**** Getters and Setters ****/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
