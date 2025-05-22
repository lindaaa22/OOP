package main;

public class SMSMessage extends Message{
	
	@Override
	public void send(String username, String passowrd) {
		if(login.authenticate(username, passowrd)) {
			//SMS sent from Alice to Bob: Hi Bob, this is Alice.
			System.out.println("SMS sent from " + sender + " to " +recipient+ " : " + content);
		}
			//SMS authentication failed for user: anyuser
		else {
			System.out.println("SMS authentication failed for user : " +username);
		}
		
	}

	public SMSMessage(ILogin login, String sender, String recipient, String content) {
		super(login, sender, recipient, content);
	}
	
	
 
}
	