package com.itacademy.java.oop.basics;

public class PointApplication {
    public static void main(String[] args) {

        MyPoint point1 = new MyPoint(6,5);
        MyPoint point2 = new MyPoint(2,9);

        System.out.println(point1.distance(3,1));
        System.out.println(point1.distance());
        System.out.println(point1.distance(point2));

        int [] points = point1.getXY();

        for(int x : points){
            System.out.println(x);
        }

        int [] points2 = point2.getXY();

        System.out.println(points2[0] +  " " +  points2[1]);
    }
}
