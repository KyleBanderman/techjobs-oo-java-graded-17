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
        assertEquals(firstChar, System.lineSeparator());
        assertEquals(lastChar, System.lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData () {
        Job job1 = new Job("Name", new Employer("Employer"), new Location("Location"), new PositionType("Position Type"), new CoreCompetency("Core Competency"));
        assertEquals(job1.toString(),
        """
        ID:  1
        Name: Name
        Employer: Employer
        Location: Location
        Position Type: Position Type
        Core Competency: Core Competency""");
    }
}
