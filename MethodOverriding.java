package CoreJava;

class Notificaton {
	void sendNotification() {
		System.out.println("Sending a notification...");
	}
}
class EmailNotificaton extends Notificaton {
	void sendNotification() {
		System.out.println("Sending a notification through Email.");
	}
	
}
class SMSNotificaton extends Notificaton {
	void sendNotification() {
		System.out.println("Sending a notification through SMS.");
	}
	
}
class PushNotificaton extends Notificaton {
	void sendNotification() {
		System.out.println("Sending a notification through Mobile App.");
	}
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		
		Notificaton n;
		n = new EmailNotificaton();
		n.sendNotification();
		
		n = new SMSNotificaton();
		n.sendNotification();
		
		n = new PushNotificaton();
		n.sendNotification();	

	}

}
