package com.workintech.inheritance.company;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        super.work();
        setSalary(35000);
        System.out.println(getName()+"MidDeveloper begins to work!");
    }
}
