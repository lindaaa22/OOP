package main;

public class EmailMessage extends Message {
	


	@Override
	public void send(String username, String passowrd) {
		//Email sent from alice@example.com to bob@example.com: Hello Bob!
		if(login.authenticate(username, passowrd)) {
			System.out.println("Email sent from " + sender + " to " + recipient + ": " + content);
		}
		//Email authentication failed for user: alice
		else {
			System.out.println("Email authentication failed for user : "+username);
		}
		
	}

	public EmailMessage(ILogin login, String sender, String recipient, String content) {
		super(login, sender, recipient, content);
	}
	
}
