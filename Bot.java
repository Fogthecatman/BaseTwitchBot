import org.jibble.pircbot.PircBot;

public class Bot extends PircBot {
	
	public Bot(){
		setName("Botthecatman");
	}
	
	public void onAction(String sender, String login, String hostname,
			String target, String action) {
		System.out.println(sender + ": " + action);
	}
	
	
	public void onMessage(String channel, String sender, String login, String hostname, String message) 
	{
		System.out.println(sender + ": " + message);
	}
}
