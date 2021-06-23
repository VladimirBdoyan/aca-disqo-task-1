package com.company;

public class Point {

    private final int x;
    private final int y;

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
        dis = Math.sqrt((this.x - secondPoint.getX()) * (this.x - secondPoint.getX()) +
                (this.y - secondPoint.getY()) * (this.y - secondPoint.getY()));
        return dis;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}