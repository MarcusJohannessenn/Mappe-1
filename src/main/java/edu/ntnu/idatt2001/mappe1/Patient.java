package edu.ntnu.idatt2001.mappe1;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Patient)){
            return false;
        }

        Patient patient = (Patient) o;
        return getSocialSecurityNumber().equals(patient.getSocialSecurityNumber());
    }
}
