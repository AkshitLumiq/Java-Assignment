import java.lang.Math;

class circle {
  private double radius;
  private String color;

  circle() {
    radius = 1.0;
    color = "red";
  }

  circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  double getRadius() {
    return this.radius;
  }

  double getArea() {
    return this.radius * this.radius * Math.PI;
  }
}

class makeCircle {
  public static void main(String args[]) {
    circle c1 = new circle();
    circle c2 = new circle(1.1, "Orange");

    System.out.println("For circle 1: radius: " + c1.getRadius() + " area: " + c1.getArea());
    System.out.println("For circle 2: radius: " + c2.getRadius() + " area: " + c2.getArea());
  }
}