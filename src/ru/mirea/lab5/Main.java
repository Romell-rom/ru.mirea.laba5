package ru.mirea.lab5;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(new Point(1,1), 10f);

        System.out.println(circle);

        PointMovable pointMovable = new PointMovable(10,10);
        System.out.println(pointMovable);
        pointMovable.move(12,19);
        System.out.println(pointMovable);
        pointMovable.move(-12,-29);
        System.out.println(pointMovable);
        CircleMovable circlemovable = new CircleMovable(1,1);
        System.out.println(circlemovable);
    }
}
