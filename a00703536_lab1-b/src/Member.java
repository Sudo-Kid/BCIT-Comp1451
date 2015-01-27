/**
 * 
 */

/**
 * @author A00703536
 *
 */
public class Member {

	public static final int FIRST_MONTH = 1;
	public static final int LAST_MONTH = 12;
	public static final int CURRENT_YEAR = 2015;
	public static final String DEFAULT_NAME = "unknown";
	
	private String firstName;
	private String lastName;
	private int monthJoined;
	private int yearJoined;
	
	/**
	 * 
	 */
	public Member() {
		setFirstName(DEFAULT_NAME);
		setLastName(DEFAULT_NAME);
		setMonthJoined(FIRST_MONTH);
		setYearJoined(CURRENT_YEAR);
	}

	/**
	 * @param firstName used to set members first name
	 * @param lastName used to set members last name
	 * @param monthJoined used to set the month the member joined
	 * @param yearJoined used to set the year the member joined
	 */
	public Member(String firstName, String lastName, int monthJoined,
			int yearJoined) {
		super();
		setFirstName(firstName);
		setLastName(lastName);
		setMonthJoined(monthJoined);
		setYearJoined(yearJoined);
	}

	/**
	 * @return the first name of the member
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName sets the first name of the member
	 */
	public void setFirstName(String firstName) {
		if(firstName != null && !firstName.isEmpty()) {
			this.firstName = firstName;
		} else {
			this.firstName = DEFAULT_NAME;
		}
	}

	/**
	 * @return the last name of the member
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName sets the last name of the member
	 */
	public void setLastName(String lastName) {
		if(lastName != null && !lastName.isEmpty()) {
			this.lastName = lastName;
		} else {
			this.lastName = DEFAULT_NAME;
		}
	}

	/**
	 * @return the month the member joined
	 */
	public int getMonthJoined() {
		return monthJoined;
	}

	/**
	 * @param monthJoined sets the month the member joined
	 */
	public void setMonthJoined(int monthJoined) {
		if(monthJoined >= FIRST_MONTH && monthJoined <= LAST_MONTH) {
			this.monthJoined = monthJoined;
		} else {
			this.monthJoined = FIRST_MONTH;
		}
	}

	/**
	 * @return the year the member joined
	 */
	public int getYearJoined() {
		return yearJoined;
	}

	/**
	 * @param yearJoined sets the year the member joined
	 */
	public void setYearJoined(int yearJoined) {
		if(yearJoined > 0 && yearJoined <= CURRENT_YEAR) {
			this.yearJoined = yearJoined;
		} else {
			this.yearJoined = CURRENT_YEAR;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Member [firstName=" + firstName + ", lastName=" + lastName
				+ ", monthJoined=" + monthJoined + ", yearJoined=" + yearJoined
				+ "]";
	}
	
	
}
