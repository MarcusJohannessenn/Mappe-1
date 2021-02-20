package edu.ntnu.idatt2001.mappe1;

import java.util.ArrayList;

/**
 * @author marcusjohannessen
 */

public class Hospital {
    private String hospitalName;
    private ArrayList<Department> departmentsRegister;


    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.departmentsRegister = new ArrayList<Department>();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public ArrayList<Department> getDepartmentsRegister() {
        return (ArrayList<Department>) departmentsRegister.clone();
    }

    public void addDepartment(Department department){
        for (Department department1: departmentsRegister){
            if(department.equals(department1)){

            }
        }
    }
}
