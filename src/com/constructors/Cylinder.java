package com.constructors;

public class Cylinder {
    private int radius;
    private int height;

    public Cylinder() {
        this.radius = 10;
        this.height = 5;
    }

    public Cylinder(int radius) {
        setradius(radius);
        this.height = 1;
    }

    public Cylinder(int radius, int height) {
        setradius(radius);
        setheight(height);
    }

    public int getradius() {
        return this.radius;
    }

    public void setradius(int radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    public int getheight() {
        return this.height;
    }

    void setheight(int height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public void setdimensions(int radius, int height) {
        setradius(radius);
        setheight(height);
    }

    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Radius: " + c1.getradius());
        System.out.println("Height: " + c1.getheight());
        
    }
}

 
 
 
 
 