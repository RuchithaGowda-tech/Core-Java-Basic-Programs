package CoreJava;
class Appointment{
	void bookAppointment(String doctorName) {
		System.out.println("Appointment booked with Dr."+ doctorName);
	}
	void bookAppointment(String doctorName,String date) {
		System.out.println("Appointment booked with Dr."+ doctorName + " on " + date);
	}
	void bookAppointment(String doctorName,String date,String time) {
		System.out.println("Appointment booked with Dr."+ doctorName + " on " + date + " at " + time);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Appointment ap=new Appointment();
		ap.bookAppointment("Rahul");
		ap.bookAppointment("Anjali","15-Aug-2026");
		ap.bookAppointment("Rahul","10-Aug-2026","10:30 AM");
	}

}
