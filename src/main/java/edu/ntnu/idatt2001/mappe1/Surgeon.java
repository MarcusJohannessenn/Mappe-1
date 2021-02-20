package edu.ntnu.idatt2001.mappe1;

/**
 * @author marcusjohannessen
 */

public class Surgeon extends Doctor {

    public Surgeon(String firstName, String lastName, String socialSecurityNumber) {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     *
     * @param patient
     * @param diagnosis
     * if patients exists set diagnosis
     */
    public void setDiagnosis(Patient patient, String diagnosis){
        if(patient == null || diagnosis == null && diagnosis.equals("")){
            throw new IllegalArgumentException("No patient or no diagnosis detected");
        }else {
            patient.setDiagnosis(diagnosis);
        }
    }


}