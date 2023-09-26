import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Great to see you!", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        return String.format("It is currently %s", new Date());
    }
    
    public String respondBeforeAlexis(String conversation) {
        if(conversation.indexOf("Alexis") > -1){
            return "She's not that helpful today. What can I get for you?";
        }

        if(conversation.indexOf("Alfred") > -1) {
            return "At your service. How may I be of service?";
        }
        return "Ok. And maybe i'll retire after that";
    }

    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
        // SENSEI BONUS
        // Write your own AlfredQuote method using any of the String methods you have learned!
}