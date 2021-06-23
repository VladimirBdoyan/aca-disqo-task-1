package com.company;

import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please input first point coordinate X ");
        int x1 = sc.nextInt();
        System.out.println("Please input first point coordinate Y ");
        int y1 = sc.nextInt();

        Point point = new Point(x1, y1);
        double xyDis = point.distance();
        System.out.println(" Distance of that point from x=0, y=0 coordinate is " + xyDis);

        System.out.println("Please input second point coordinate X ");
        int x2 = sc.nextInt();
        System.out.println("Please input second point coordinate Y ");
        int y2 = sc.nextInt();

        Point secondPoint = new Point(x2, y2);
        double pointsDis = point.distance(secondPoint);
        System.out.println(" Distance of between those two points is " + pointsDis);
    }
}
