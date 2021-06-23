package com.company;

public class Point {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance() {
        double dis;
        dis = Math.sqrt((x * x) + (y * y));
        return dis;
    }

    public double distance(Point secondPoint) {
        double dis;
        dis = Math.sqrt((x - secondPoint.x) * (x - secondPoint.x) + (y - secondPoint.y) * (y - secondPoint.y));
        return dis;
    }
}