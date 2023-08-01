package com.workintech.inheritance.company;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary,JuniorDeveloper[]juniorDevelopers, MidDeveloper[]midDevelopers,SeniorDeveloper[]seniorDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.midDevelopers = midDevelopers;
        this.seniorDevelopers = seniorDevelopers;

    }


    public JuniorDeveloper[] getJuniorDevelopers() {
        return juniorDevelopers;
    }

    public MidDeveloper[] getMidDevelopers() {
        return midDevelopers;
    }

    public SeniorDeveloper[] getSeniorDevelopers() {
        return seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper junior) {
        try{
            if(juniorDevelopers[index] == null){
                juniorDevelopers[index] = junior;
            } else{
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found " + ex.getMessage());
        }
    }
    public void addEmployee(int index, MidDeveloper mid) {
        try {
            if(midDevelopers[index] == null){
                midDevelopers[index] = mid;
            } else{
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found " + ex.getMessage());
        }
    }
    public void addEmployee(int index, SeniorDeveloper senior) {
        try {
            if(seniorDevelopers[index] == null){
                seniorDevelopers[index] = senior;
            } else{
                System.out.println("Index is full");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Index not found " + ex.getMessage());
        }
    }
    public void work(){
        System.out.println(getName() + " HR Manager starts to working");
        setSalary(50000);
    }
}