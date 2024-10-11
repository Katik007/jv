package org.knit.lab2;

import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    public abstract double getVolume();
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

class Container {
    private double capacity;
    private double availableVolume;
    private List<Shape> shapes;

    public Container(double capacity) {
        this.capacity = capacity;
        this.availableVolume = capacity;
        this.shapes = new ArrayList<>();
    }

    public String add(Shape shape) {
        double shapeVolume = shape.getVolume();
        if (shapeVolume <= availableVolume) {
            shapes.add(shape);
            availableVolume -= shapeVolume;
            return "Фигура добавлена. Оставшийся объем: " + availableVolume;
        } else {
            return "Недостаточно места для добавления фигуры. Оставшийся объем: " + availableVolume;
        }
    }

    public double getAvailableVolume() {
        return availableVolume;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Container container = new Container(1000);

        Shape sphere = new Sphere(5);
        Shape cube = new Cube(3);
        Shape cylinder = new Cylinder(2, 5);

        System.out.println(container.add(sphere));
        System.out.println(container.add(cube));
        System.out.println(container.add(cylinder));
    }
}