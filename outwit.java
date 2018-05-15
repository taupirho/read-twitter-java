package twit;
import twitter4j.DirectMessage;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;


/**
 * Example application that sends a direct message to a specified Twitter user.
 * 
 */
public final class SendDirectMessage {
 
    public static void main(String[] args) {
    	
    	if(args.length != 2) {
            System.out.println("Usage is @outwit username \"message_to_send\" ");
            System.exit(-1);

    	}
    	ConfigurationBuilder cb = new ConfigurationBuilder();
    	cb.setDebugEnabled(true)
    	  .setOAuthConsumerKey("*************************")
    	  .setOAuthConsumerSecret("**************************************************")
    	  .setOAuthAccessToken("***************************************************")
    	  .setOAuthAccessTokenSecret("*********************************************");
    	TwitterFactory tf = new TwitterFactory(cb.build());
    	Twitter twitter = tf.getInstance();
    	
        try {
            DirectMessage message = twitter.sendDirectMessage(args[1], args[2]);
            System.out.println("Direct message successfully sent to " + message.getRecipientScreenName());
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to send a direct message to : " + args[1]);
            System.exit(-1);
        }
    }
}
