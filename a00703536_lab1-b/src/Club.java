/**
 * 
 */

/**
 * @author A00703536
 *
 */
public class Club {
	private Member[] members;
	
	public Club() {
		this.members = new Member[10];
	}
	
	/**
	 * @param member Used to add member to club
	 */
	public void join(Member member) {
		for(int counter = 0; counter < 11; counter++) {
			if(counter < 10 && members[counter] == null) {
				members[counter] = member;
				break;
			} else if (counter == 10){
				System.out.println("Your club is full.");
				break;
			}
		}
	}
	
	/**
	 * @return The number of members in the club
	 */
	public int numberOfMembers() {
		int counter = 0;
		for(Member member: members){
			if(member != null) {
				counter++;
			}
		}
		return counter;
	}
	
	/**
	 * prints a list of members
	 */
	public void showMembers() {
		System.out.println("Club members");
		for(Member member: this.members) {
			if(member != null) {
				System.out.println("Name: " + member.getFirstName() + " " + member.getLastName());
				System.out.println("Month Joined: " + member.getMonthJoined());
				System.out.println("Year Joined: " + member.getYearJoined());
				System.out.println("");
			}
		}
	}
	
	/**
	 * @param year prints a list of users that joined in year provided
	 */
	public void showMembersByYear(int year) {
		System.out.println("Memeber that joined in " + year);
		for(Member member: this.members) {
			if(member != null && member.getYearJoined() == year) {
				System.out.println("Name: " + member.getFirstName() + " " + member.getLastName());
				System.out.println("Month Joined: " + member.getMonthJoined());
				System.out.println("Year Joined: " + member.getYearJoined());
				System.out.println("");
			}
		}
	}
	
	/**
	 * @param year removes member at year provided
	 */
	public void removeMembersByYear(int year) {
		for(int i = 0; i < 10; i++) {
			if(this.members[i] != null && this.members[i].getYearJoined() == year) {
				members[i] = null;
			}
		}
	}
}
