package com.workintech.inheritance.mathModel;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        checkHeight(height);
    }

    private void checkHeight(double height){
        if(height < 0){
            this.height = 0;
        } else this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        checkHeight(height);
    }

    public double getVolume(){
        return getArea() * height;
    }
}