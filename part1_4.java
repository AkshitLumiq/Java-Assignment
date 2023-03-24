import java.lang.Math;

class circle {
  protected double radius;
  protected String color;

  circle() {
    System.out.println("Circle constructor");
    radius = 2.0;
    color = "red";
  }

  circle(double radius, String color) {
    System.out.println("Circle constructor");
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

class cylinder extends circle {
  private double height;

  cylinder() {
    System.out.println("Cylinder constructor");
    height = 3.0;
  }

  double getVolume() {
    return Math.PI * this.height * this.radius * this.radius;
  }
}

class makeCylinder {
  public static void main(String arg[]) {
    System.out.println("constructor calls: ");
    cylinder c1 = new cylinder();
    System.out.println();
    System.out
        .println("Circle class : \nVariables: Radius - " + c1.radius + "\nFunction: getArea() - " + c1.getArea());
    System.out.println("Volume of cylinder: " + c1.getVolume());
  }
}