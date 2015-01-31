/**
 * 
 */

/**
 * @author A00703536
 * @version Jan 31, 2015
 *
 */
public class Lab2b_driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmailInfo addressBook = new EmailInfo();
		String separator = "----------------------------------------------------";
		
		// Declaring the names of the friends
		String[] names = {"Bob", "Jilly", "Chris", "Billy", "Billy"};
		
		
		// Adding the friends to the EmailInfo class
		for(String name : names) {
			addressBook.addFriend(name, name + "@testmail.com");
		}
		System.out.println(separator);
		
		// Printing all the friends and there details to the terminal
		System.out.println();
		addressBook.listAll();
		System.out.println(separator);
		
		// Removing a friend from the database
		System.out.println();
		addressBook.removeFriend("Jilly");
		addressBook.listAll();
		System.out.println(separator);
		
		// Looking for a friend by there name
		System.out.println();
		System.out.println(addressBook.getAddress("Chris"));
		System.out.println(separator);
		
		// Looking for friend by there email address
		System.out.println();
		addressBook.findFriends("billy@testmail.com");
		System.out.println(separator);
	}

}
