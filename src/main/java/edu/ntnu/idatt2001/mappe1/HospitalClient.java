package edu.ntnu.idatt2001.mappe1;

public class HospitalClient {
    public static void main(String[] args) {
        Department dep = new Department("naem");
        Patient hei = new Patient("Marcus","jo", "34343", "retard");
        System.out.println(dep.addPatient(hei));
        System.out.println(dep.equals(hei));
        dep.removePerson(hei);

        System.out.println(dep.getPatients());
    }
}
