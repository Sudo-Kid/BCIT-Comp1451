/**
 * 
 */

/**
 * @author A00703536
 *
 */
public class ClubTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Club club1 = new Club();
		
		Member member1 = new Member("Test1", "member1", 2, 2013);
		Member member2 = new Member("Test2", "member2", 2, 2015);
		Member member3 = new Member("Test2", "", 13, 2015);
		Member member4 = new Member("Test2", "", 13, 2015);
		
		club1.join(member1);
		club1.join(member2);
		club1.join(member3);
		club1.join(member4);
		
		club1.numberOfMembers();
		club1.showMembers();
		club1.removeMembersByYear(2015);
		club1.showMembers();

	}

}
