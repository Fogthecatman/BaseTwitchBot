
public class Driver {

	public static void main(String[] args) {
		
		Bot b = new Bot();
		
		try {
	    		System.out.println("Trying Login");
	    		String channel  = "#fogthecatman";
			String password = "oauth:myOathKey";
			b.connect("irc.twitch.tv", 6667, password);
			b.setVerbose(false);
			b.joinChannel(channel);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
