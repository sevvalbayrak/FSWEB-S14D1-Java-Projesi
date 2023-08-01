package com.workintech.inheritance.mathModel;

public class Circle {
    private double radius;

    public Circle(double radius) {
        checkRadius(radius);
    }

    private void checkRadius(double radius){
        if(radius < 0){
            this.radius = 0;
        } else this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        checkRadius(radius);
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

}