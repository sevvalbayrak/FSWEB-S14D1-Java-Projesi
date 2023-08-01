package com.workintech.inheritance.company;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        setSalary(45000);
        System.out.println(getName()+"senior developer begins to work!");
    }
}
