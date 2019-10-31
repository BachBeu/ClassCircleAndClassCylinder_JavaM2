package com.Bach;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){

    }
    public Cylinder(double height){
        this.height = height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius,color);
        this.height = height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        double V = Math.PI * radius * radius * height;
        return V;
    }
    public String toString(){
        return "A Cylinder with width " + getRadius() + " and height " + getHeight()
                + ", which is a subclass of " + super.toString() + "volume is" + this.getVolume();
    }
}
