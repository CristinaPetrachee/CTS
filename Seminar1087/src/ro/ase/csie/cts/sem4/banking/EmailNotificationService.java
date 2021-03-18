package ro.ase.csie.cts.sem4.banking;

public class EmailNotificationService implements NotificationService {

	@Override
	public void sendNotification(Person destination, String msg) {
		System.out.println("Sending email to " + destination.getEmail());
		System.out.println(msg);

	}

}
