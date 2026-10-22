//Ride Booking
package CoreJava;
import java.util.Scanner;
interface Ride {
	void bookRide();
	double calculateFare();
	void displayDetails();
}
class Bike implements Ride {
	String customer;
	String pickup;
	String destination;
	double distance;
	
	Bike(String customer,String pickup,String destination,double distance) {
		this.customer=customer;
		this.pickup=pickup;
		this.destination=destination;
		this.distance=distance;
	}
	public void bookRide() {
		System.out.println("\nBike Ride Booked Successfully!");
	}
	public double calculateFare() {
		return 30+(distance*10);
	}
	public void displayDetails() {
		System.out.println("Customer:"+customer);
		System.out.println("Pickup:"+pickup);
		System.out.println("Destination:"+destination);
		System.out.println("Ride type:Bike");
		System.out.println("Distance:"+distance+"km");
		System.out.println("Fare:Rs"+calculateFare());
	}
}
class Car implements Ride {
	String customer;
	String pickup;
	String destination;
	double distance;
	
	Car(String customer,String pickup,String destination,double distance) {
		this.customer=customer;
		this.pickup=pickup;
		this.destination=destination;
		this.distance=distance;
	}
	public void bookRide() {
		System.out.println("\nCar Ride Booked Successfully!");
	}
	public double calculateFare() {
		return 50+(distance*18);
	}
	public void displayDetails() {
		System.out.println("Customer:"+customer);
		System.out.println("Pickup:"+pickup);
		System.out.println("Destination:"+destination);
		System.out.println("Ride type:Car");
		System.out.println("Distance:"+distance+"km");
		System.out.println("Fare:Rs"+calculateFare());
	}
}
public class Interfaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=====RIDE BOOKING SYSTEM======");
		System.out.println("Enter Customer Name:");
		String name=sc.nextLine();
		System.out.println("Enter Pickup Location:");
		String pickup=sc.nextLine();
		System.out.println("Enter Destination:");
		String destination=sc.nextLine();
		System.out.println("Enter Distance:");
		double distance=sc.nextDouble();
		System.out.println("\n1.Bike");
		System.out.println("2.Car");
		System.out.println("Enter Choice:");
		int choice=sc.nextInt();
		Ride r;
		if(choice==1 ) {
			r=new Bike(name,pickup,destination,distance);
		}
		else {
			r=new Car(name,pickup,destination,distance);
		}
		r.bookRide();
		r.displayDetails();
		sc.close();
	}

}
