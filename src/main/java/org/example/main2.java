package org.example;

public class main2 {
    public static void main(String[] args) {
    Circle circle = new Circle(5.0);


     double radius = circle.getRadius();
    System.out.println("radious of a circle: " + radius);

    double circumference = circle.calculateCircumference();
        System.out.println("Circumference of the circle: " + circumference);
}
}
