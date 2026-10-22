//Movie Ticket Booking
package CoreJava;
import java.util.Scanner;
abstract class Movie {
	String movieName;
	String theatre;
	int tickets;
	double price;
	
	Movie(String movieName,String theatre,int tickets,double price) {
		this.movieName=movieName;
		this.theatre=theatre;
		this.tickets=tickets;
		this.price=price;
	}
	abstract double calculateAmount();
	void displayDetails() {
		System.out.println("Theatre:"+theatre);
		System.out.println("Tickets:"+tickets);
		System.out.println("Price:Rs"+price);
		System.out.println("Total:Rs"+calculateAmount());
		}
}
class RegularMovie extends Movie  {
	RegularMovie(String movieName,String theatre,int tickets,double price) {
		super(movieName,theatre,tickets,price);
	}
	double calculateAmount() {
		return tickets*price;
	}
}
class PremiumMovie extends Movie  {
	PremiumMovie(String movieName,String theatre,int tickets,double price) {
		super(movieName,theatre,tickets,price);
	}
	double calculateAmount() {
		return (tickets*price)+(tickets*50);
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=====MOVIE TICKET BOOKING=====");
		System.out.println("Enter Movie Name:");
		String movie=sc.nextLine();
		System.out.println("Enter Theatre Name:");
		String theatre=sc.nextLine();
		System.out.println("Enter Number of Price:");
		int tickets=sc.nextInt();
		System.out.println("Enter Ticket Price:");
		double price=sc.nextDouble();
		System.out.println("\n1.Regular");
		System.out.println("2.Premium");
		System.out.println("Enter Choice:");
		int choice=sc.nextInt();
		Movie m;
		if(choice==1 ) {
			m=new RegularMovie(movie,theatre,tickets,price);
		}
		else {
			m=new PremiumMovie(movie,theatre,tickets,price);
		}
		m.displayDetails();
		System.out.println("\nBooking successfull!");
		sc.close();
			
		}
	}
