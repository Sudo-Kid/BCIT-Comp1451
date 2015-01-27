import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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
		if (year <= Member.CURRENT_YEAR) {
			ArrayList<Member> memberList = new ArrayList<Member>(
					Arrays.asList(members));
			Iterator<Member> it = memberList.iterator();
			while (it.hasNext()) {
				Member member = it.next();
				if (member != null && member.getYearJoined() == year) {
					it.remove();
				}
			}
			this.members = memberList.toArray(new Member[10]);
		} else {
			System.out.println("The provided year higher then the current year.");
		}
	}
}
