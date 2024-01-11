package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId () {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields () {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job.getEmployer() instanceof Employer);
        assertEquals(job.getEmployer().getValue(), "ACME");

        assertTrue(job.getLocation() instanceof Location);
        assertEquals(job.getLocation().getValue(), "Desert");

        assertTrue(job.getPositionType() instanceof PositionType);
        assertEquals(job.getPositionType().getValue(), "Quality control");

        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals(job.getCoreCompetency().getValue(), "Persistence");

        assertTrue(job.getName() instanceof String);
        assertEquals(job.getName(), "Product tester");
    }

    @Test
    public void testJobsForEquality () {
        Job job1 = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("Position Type"), new CoreCompetency("Core Competency"));
        Job job2 = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("Position Type"), new CoreCompetency("Core Competency"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine () {
        Job job1 = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("Position Type"), new CoreCompetency("Core Competency"));
        String testString = job1.toString();
        char firstChar = testString.charAt(0);
        char lastChar = testString.charAt(testString.length() - 1);
        assertEquals(firstChar, '\n');
        assertEquals(lastChar, '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData () {
        Job job1 = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("Position Type"), new CoreCompetency("Core Competency"));
        assertEquals(job1.toString(), '\n' + "ID: 4" + '\n' + "Name: Name" + '\n' + "Employer: Employer" + '\n' + "Location: Location" + '\n' + "Position Type: Position Type" + '\n' + "Core Competency: Core Competency" + '\n');
    }

    @Test
    public void testToStringHandlesEmptyField () {
        Job job1 = new Job ("Name", new Employer(""), new Location("Location"), new PositionType("Position Type"), new CoreCompetency(""));
        assertEquals(job1.toString(), '\n' + "ID: 3" + '\n' + "Name: Name" + '\n' + "Employer: Data not available" + '\n' + "Location: Location" + '\n' + "Position Type: Position Type" + '\n' + "Core Competency: Data not available" + '\n');

    }
}

