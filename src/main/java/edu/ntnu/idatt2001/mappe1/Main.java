package edu.ntnu.idatt2001.mappe1;

public class Main {
    public static void main(String[] args) {
        Department dep = new Department("naem");
        Patient hei = new Patient("Marcus","jo", "34343", "retard");
        dep.addPatient(hei);
        System.out.println(dep.equals(hei));
    }
}
