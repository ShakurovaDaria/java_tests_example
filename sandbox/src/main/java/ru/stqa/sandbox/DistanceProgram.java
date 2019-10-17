package ru.stqa.sandbox;

public class DistanceProgram {

  public static void main(String[] args) {

    Point p1 = new Point();
    p1.x = -4;
    p1.y = 9;

    Point p2 = new Point();
    p2.x = 16;
    p2.y = 2;

    System.out.println("Расстояние между точками с координатами: p1 = (" + p1.x + ", " + p1.y + "), " +
            "p2 = (" + p2.x + ", " + p2.y + "), равно: " + distance(p1, p2));

  }
  public static double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow((p2.x - p1.x), 2) + (Math.pow((p2.y - p1.y), 2)));
  }

}
