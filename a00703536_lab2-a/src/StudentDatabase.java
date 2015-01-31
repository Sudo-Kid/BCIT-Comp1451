import java.util.HashMap;

/**
 * 
 */

/**
 * @author A00703536, A00946739
 * @version 2015-01-28
 */
public class StudentDatabase {
	public static final int NUM_QUIZZES = 10;
	public static final int MIN_GRADE = 0;
	public static final int MAX_GRADE = 100;
	
	private HashMap<String, int[]> quizMarks;
	
	public StudentDatabase() {
		quizMarks = new HashMap<String, int[]>();
	}
	
	
	
	/** @return the properly-formatted name. */
	private String formatName(String name) {
		if(name != null && name.trim().length() > 0) {
			return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
		} else {
			System.out.println("You must prevoide a string value.");
			return null;
		}
	}
	
	/** Add a student to the database and create a new array to hold that
	student's quiz marks ( NUM_QUIZZES quizzes). These marks will by default
	be set to MIN_GRADE. */
	public void addStudent(String studentName) {
		if(studentName != null && studentName.trim().length() > 0) {
			this.quizMarks.put(formatName(studentName), new int[NUM_QUIZZES]);
		} else {
			System.out.println("Your student name must not be null!");
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentDatabase [quizMarks=" + quizMarks + "]";
	}

	/** @return the array of quiz marks for this student. */
	public int[] getQuizzes(String student) {
		if(student != null && student.trim().length() > 0) {
			return this.quizMarks.get(formatName(student));
		} else {
			System.out.println("Your student name must not be null!");
			return null;
		}
	}
	/** Change the mark for the specified student. This method ensures the
	student exists in the database. It also ensures the quiz to be changed
	is valid, and the mark is within the range MIN_GRADE to MAX_GRADE. If
	anything is not valid it displays an appropriate error message. */
	public void changeQuizMark(String studentName, int whichQuiz,
	int newMark) {
		if(this.quizMarks.get(formatName(studentName)) != null && whichQuiz < NUM_QUIZZES) {
			if(newMark >= MIN_GRADE && newMark <= MAX_GRADE) {
				int[] tempQuiz = this.quizMarks.get(formatName(studentName));
				tempQuiz[whichQuiz] = newMark;
				this.quizMarks.put(formatName(studentName), tempQuiz);
			} else {
				System.out.println("Makrs must be within 0 and 100.");
			}
		} else {
			System.out.println("Name is invalid or quiz chosen is out of range.");
		}
	}
	
	/** Display the quiz marks for all students in the database. */
	public void showQuizMarks() {
		if(this.quizMarks.size() > 0) {
			for(String studentNames : quizMarks.keySet()) {
				System.out.print("Quiz marks for: " + studentNames);
				for(int mark : quizMarks.get(studentNames)) {
					System.out.print(" " + mark);
				}
				System.out.println();
				System.out.println();
			}
		}
	}
}
