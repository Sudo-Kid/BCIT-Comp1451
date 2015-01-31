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
		Member member2 = new Member("Test2", "member2", 2, 2000);
		Member member3 = new Member("Test3", "member3", 13, 2014);
		Member member4 = new Member("Test4", "member4", 13, 2011);
		Member member5 = new Member("Test5", "member5", 13, 2000);
		Member member6 = new Member("Test6", "member6", 13, 2008);
		Member member7 = new Member("Test7", "member7", 13, 2001);
		Member member8 = new Member("Test8", "member8", 13, 2002);
		Member member9 = new Member("Test9", "member9", 13, 2005);
		Member member10 = new Member("Test10", "member10", 13, 2012);
		Member member11 = new Member("Test11", "member11", 13, 2013);
		
		club1.join(member1);
		club1.join(member2);
		club1.join(member3);
		club1.join(member4);
		club1.join(member5);
		club1.join(member6);
		club1.join(member7);
		club1.join(member8);
		club1.join(member9);
		club1.join(member10);
		club1.join(member11);
		
		
		
		System.out.println(club1.numberOfMembers());
		club1.removeMembersByYear(2000);
		club1.showMembers();
		club1.join(member2);
		club1.showMembers();
		club1.numberOfMembers();
		club1.showMembersByYear(2000);
	}

}
