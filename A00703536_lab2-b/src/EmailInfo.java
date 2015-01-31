import java.util.HashMap;

/**
 * Email address book 
 * 
 * This address book assume that everyone has only one email address and that they don’t identical names
 */

/**
 * @author A00703536
 * @version Jan 31, 2015
 */
public class EmailInfo {
	
	private HashMap<String, String> addressBook;
	
	/**
	 * The default constructor initialize the HashMap used to store email addresses
	 */
	public EmailInfo() {
		addressBook = new HashMap<String, String>();
	}
	
	/*
	 * @return Names formatted in camel case. 
	 * @param name Used to pass in the name needed to be formated.
	 */
	private String formatName(String name) {
		if(name != null && name.trim().length() > 0) {
			return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		} else {
			System.out.println("You must prevoide a string value.\r\n");
			return null;
		}
	}
	
	/**
	 * Add a friend to the address book. 
	 * 
	 * @param name Formats the name into camel case and uses it as the key for the provided email address.
	 * @param email Adds the provided string to the email address with the name as the key.
	 */
	public void addFriend(String name, String email) {
		if(name != null && name.trim().length() > 0) {
			if(email != null && name.trim().length() > 0) {
				name = formatName(name);
				if(!this.addressBook.containsKey(name)) {
					this.addressBook.put(formatName(name), email.toLowerCase());
				} else {
					System.out.println("You already have a friend by the name: " + name);
				}
			} else {
				System.out.println("You must provide a valid string for the email address.\r\n");
			}
		} else {
			System.out.println("You must provide a valid string for the name.\r\n");
		}
	}
	
	/** 
	 * Remove a friend from the address book. The name passed in can be
	 * in upper case, lower case, or mixed. The friend and his/her email will
	 * be removed from the address book.
	 * 
	 * @param name The name of the user you would like to remove from the address book.
	 */
	public void removeFriend(String name) {
		if(name != null && name.trim().length() > 0) {
			name = formatName(name);
			if(this.addressBook.containsKey(name) != false) {
				this.addressBook.remove(name);
			} else {
				System.out.println("There is no information for " + name + "\r\n");
			}
		} else {
			System.out.println("You must provide a valid string for the name.\r\n");
		}
	}
	
	/** 
	 * Return an email address based on friend’s name. The name passed in can be in upper case, 
	 * lower case, or mixed. The friend's email address will be returned.
	 *
	 * @param name The name of the friend you wish to find the email address for.
	 * @return The email address of the friend passed in String format.
	 */
	public String getAddress(String name) {
		if(name != null && name.trim().length() > 0) {
			name = formatName(name);
			if(this.addressBook.containsKey(name) != false) {
				return this.addressBook.get(name);
			} else {
				System.out.println("There is no information for " + name + "\r\n");
			}
		} else {
			System.out.println("You must provide a valid string for the name.\r\n");
		}
		return null;
	}
	
	/** 
	 * Find and display friends based on their email address. There might be more than one friend using the same email.
	 * 
	 * @param email The email address of the friend you are looking for.
	 */
	public void findFriends(String email) {
		if(email != null && email.trim().length() > 0) {
			email = email.toLowerCase();
			if(this.addressBook.containsValue(email)) {
				System.out.println("List all contact with requested email address: \"" + email + "\"");
				for(String name : this.addressBook.keySet()) {
					if(this.addressBook.get(name).equals(email)) {
						System.out.println();
						System.out.println("Name: " + name);
						System.out.println("Email: " + email + "\r\n");
					}
				}
			} else {
				System.out.println("The email " + email + " has not yet been added.");
			}
		} else {
			System.out.println("You must provide a valid string for the email.");
		}
	}
	
	/** 
	 * List all contacts and their email addresses 
	 */
	public void listAll() {
		if(!this.addressBook.isEmpty()) {
			System.out.println("Your contact list");
			System.out.println();
			for(String name : this.addressBook.keySet()) {
				System.out.println("Name: " + name);
				System.out.println("Email: " + this.addressBook.get(name) + "\r\n");
			}
		} else {
			System.out.println("Your address book is emtpy.");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmailInfo [addressBook=" + addressBook + "]";
	}
	
}
