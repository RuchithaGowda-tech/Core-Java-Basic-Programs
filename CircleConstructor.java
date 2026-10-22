package CoreJava;
class Circle
{
	static double pi=3.14;
	double radius;
	
Circle(double radius)
{
	this.radius = radius;
}
double findArea() {
	return pi*radius*radius;
}
}
public class CircleConstructor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c1= new Circle(2);
Circle c2= new Circle(4);
Circle c3= new Circle(7);

double area1=c1.findArea();
double area2=c2.findArea();
double area3=c3.findArea();

double total=area1+area2+area3;

System.out.println("Area of Circle 1 = " + area1);
System.out.println("Area of Circle 2 = " + area2);
System.out.println("Area of Circle 3 = " + area3);
System.out.println("Total Area = " + total);

	}

}
