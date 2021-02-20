package edu.ntnu.idatt2001.mappe1;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author marcusjohannessen
 */

public class Department {
    private String departmentName;
    private ArrayList<Patient> patients;
    private ArrayList<Employee> employees;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.patients = new ArrayList<Patient>();
        this.employees = new ArrayList<Employee>();

    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public ArrayList<Patient> getPatients() {
        return (ArrayList<Patient>) patients.clone();
    }

    public ArrayList<Employee> getEmployees() {
        return (ArrayList<Employee>) employees.clone() ;
    }

    public boolean addEmployee(Employee employee){
        for (Employee employee1: employees){
            if(employee1.getSocialSecurityNumber().equals(employee.getSocialSecurityNumber())){
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @param patient
     * @return false if patient exists in patients list, else return true
     */

    public boolean addPatient(Patient patient){
        for (Patient patient1: patients ){
            if(patient1.getSocialSecurityNumber().equals(patient.getSocialSecurityNumber())){
                return false;
            }
        }
        return true;
    }

    public void removePerson(Person person){
        //If person is a patient
        if(person instanceof Patient){
            Patient patient = (Patient) person;
            patients.remove(patient);
            System.out.println(patient.getFirstName() + " removed from patients");
        }
        //If person is an employee
        else if (person instanceof Employee){
            Employee employee = (Employee) person;
            employees.remove(employee);
            System.out.println(employee.getFirstName() + " removed from employees");
        }else{

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Department)){
            return false;
        }
        Department that = (Department) o;
        return Objects.equals(departmentName, that.departmentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departmentName);
    }
}
