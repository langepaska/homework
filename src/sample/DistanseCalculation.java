package sample;

import java.util.Scanner;

public class DistanseCalculation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите x1");
        int x1 = console.nextInt();
        System.out.println("Введите y1");
        int y1 = console.nextInt();
        System.out.println("Введите x2");
        int x2 = console.nextInt();
        System.out.println("Введите y2");
        int y2 = console.nextInt();
        System.out.println("Result:");

        Point p1 = new Point();
        p1.setX(x1);
        p1.setY(y1);
        Point p2 = new Point();
        p2.setX(x2);
        p2.setY(y2);
        double ds = distanse(p1, p2);
        System.out.println(ds);

    }

    public static double distanse(Point p1, Point p2) {
        double result = Math.sqrt((p2.getX() - p1.getX()) * (p2.getX() - p1.getX()) + (p2.getY() - p1.getY()) * (p2.getY() - p1.getY()));
        return result;
    }
}
