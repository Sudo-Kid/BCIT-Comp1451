/**
 * 
 */

/**
* @author A00703536, A00946739
 * @version 2015-01-28
 */
public class Lab2a_driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDatabase class1 = new StudentDatabase();
		String[] students = {"Student1", "Student2", "Student3", "student4"};
		
		for(String student : students) {
			class1.addStudent(student);
		}
		
		for(String student : students) {
			class1.getQuizzes(student);
		}
		
		for(String student : students) {
			class1.changeQuizMark(student, 5, 10);
		}
		
		class1.showQuizMarks(); 	
	}

}
