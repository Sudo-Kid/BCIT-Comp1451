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
	int index = 0;
	
	public Club() {
		this.members = new Member[10];
	}
	
	/**
	 * 
	 */
	public void join(Member member) {
		if(index < 11) {
			this.members[index] = member;
			index++;
		} else {
			System.out.println("Your members list is full");
		}
	}
	
	/**
	 * 
	 */
	public int numberOfMembers() {
		System.out.println(index);
		return this.members.length;
	}
	
	/**
	 * 
	 */
	public void showMembers() {
		for(Member member: this.members) {
			if(member != null) {
				System.out.println(member);
			}
		}
	}
	
	/**
	 * 
	 */
	public void showMembersByYear(int year) {
		
	}
	
	/**
	 * 
	 */
	public void removeMembersByYear(int year) {
		if(year <= Member.CURRENT_YEAR) {
			ArrayList<Member> memberList = new ArrayList<Member>(Arrays.asList(members));
	        Iterator<Member> it = memberList.iterator();
	        while(it.hasNext()) {
	            Member member = it.next();
	            if(member != null && member.getYearJoined() == year) {
	                it.remove();
	            }
	        }
	        this.members = memberList.toArray(new Member[10]);
		} else {
			System.out.println("The provided year higher then the current year.");
		}
	}
}
