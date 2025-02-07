package com.csc205.project1;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point(3.0, 4.0);
        Point p3 = new Point(p2);

        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3);

        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p2 equals p3: " + p2.equals(p3));

        System.out.println("p1 distance from origin: " + p1.distance());
        System.out.println("p2 distance from origin: " + p2.distance());
        System.out.println("p3 distance from origin: " + p3.distance());

        System.out.println("p1 distance from p2: " + p1.distance(p2));
        System.out.println("p2 distance from p3: " + p2.distance(p3));
        System.out.println("p3 distance from p1: " + p3.distance(p1));

        p1.setX(1.0);
        p1.setY(1.0);

        System.out.println("p1: " + p1);
        System.out.println("p1 distance from origin: " + p1.distance());
        System.out.println("p1 distance from p2: " + p1.distance(p2));
        System.out.println("p1 distance from p3: " + p1.distance(p3));
    }
}
