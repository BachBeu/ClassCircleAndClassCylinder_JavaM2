package com.Bach;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5, "indigo");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(7);
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5, 6, "red");
        System.out.println(cylinder);
    }
}
