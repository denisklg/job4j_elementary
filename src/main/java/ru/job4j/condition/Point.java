package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 2, 2, 4);
        double result2 = Point.distance(55, 24, 35, 22);
        double result3 = Point.distance(7, 9, 8, 8);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (0, 0) to (2, 0) " + result2);
        System.out.println("result (0, 0) to (2, 0) " + result3);
    }
}