package swipe.utils;

/**
 * Class for message model.
 * 
 * @author Alysson Tiago Souza Cordeiro
 * 
 * @version 1.0
 *
 */
public class Message {

	/*Message Identifier */
	private int id;
	
	/*Message Text*/
	private String message;

	/*Constructor*/
	public Message(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
