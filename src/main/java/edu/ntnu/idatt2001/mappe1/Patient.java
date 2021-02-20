package edu.ntnu.idatt2001.mappe1;

/**
 * @author marcusjohannessen
 */

public class Patient extends Person implements Diagnosable {
    private String diagnosis;

    public Patient(String firstName, String lastName, String socialSecurityNumber, String diagnosis) {
        super(firstName, lastName, socialSecurityNumber);
        this.diagnosis = diagnosis;
    }

    @Override
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
