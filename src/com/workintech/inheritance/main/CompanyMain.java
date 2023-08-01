package com.workintech.inheritance.main;

import com.workintech.inheritance.company.*;

import java.util.Arrays;

public class CompanyMain {
    public static void main(String[] args) {
        Employee asci = new Employee(8, "Murat",35000);
        asci.work();

        JuniorDeveloper junior1 = new JuniorDeveloper(2, "Ayşe",22000);
        junior1.work();
        JuniorDeveloper junior2 = new JuniorDeveloper(3, "Ahmet",22000);
        junior2.work();
        JuniorDeveloper junior3 = new JuniorDeveloper(4, "Ömer",22000);
        junior3.work();

        MidDeveloper mid1 = new MidDeveloper(5, "Mehmet",28000);
        mid1.work();
        MidDeveloper mid2 = new MidDeveloper(6, "Fatma",30000);
        mid2.work();

        SeniorDeveloper senior = new SeniorDeveloper(7, "Kuzey",27500);
        senior.work();



        HRManager hrManager = new HRManager(8, "Ali",50000, new JuniorDeveloper[3], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();
        System.out.println("HR Manager Salary: " + hrManager.getSalary());
        System.out.println("Senior Salary: " + senior.getSalary());

     System.out.println("Juniors " + Arrays.toString(hrManager.getJuniorDevelopers()));
     System.out.println("Mids " + Arrays.toString(hrManager.getMidDevelopers()));
    System.out.println("Seniors " + Arrays.toString(hrManager.getSeniorDevelopers()));

        hrManager.addEmployee(0, junior1);
        hrManager.addEmployee(1,junior2);
        hrManager.addEmployee(2,junior3);
        hrManager.addEmployee(0, mid1);
        hrManager.addEmployee(1, mid2);
        hrManager.addEmployee(0, senior);
        hrManager.addEmployee(2,senior);

        System.out.println("---------------");
        System.out.println("Juniors " + Arrays.toString(hrManager.getJuniorDevelopers()));
        System.out.println("Mids " + Arrays.toString(hrManager.getMidDevelopers()));
        System.out.println("Seniors " + Arrays.toString(hrManager.getSeniorDevelopers()));
    }
}