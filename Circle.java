package java;
class Circle1 {
    static double pi = 3.14;
    double radius;

    // Constructor
    Circle1(double r) {
        radius = r;
    }

    double findArea() {
        return pi * radius * radius;
    }
}
public class Circle {
    public static void main(String[] args) {

        Circle1 c1 = new Circle1(4);
        Circle1 c2 = new Circle1(8);
        Circle1 c3 = new Circle1(2);

        double area1 = c1.findArea();
        double area2 = c2.findArea();
        double area3 = c3.findArea();

        System.out.println("Area of Circle 1 = " + area1);
        System.out.println("Area of Circle 2 = " + area2);
        System.out.println("Area of Circle 3 = " + area3);

        double total = area1 + area2 + area3;
        System.out.println("Total Area = " + total);
    }
}

