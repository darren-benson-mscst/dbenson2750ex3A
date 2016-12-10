package dbenson2750ex3a_domain;
import java.util.ArrayList;

public class CourseGrade {
	private char grade;
	private static int totalMaxPoints;
	public Section section;
	public Student student;
	public ArrayList<AssignmentGrade> assignmentGrades = new ArrayList<AssignmentGrade>();
	
	public CourseGrade(Section sec, Student st, char grade) {
		this.section = sec;
		this.student = st;
		this.grade = grade;
	}

	public char getGrade() {
		return this.grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public static int getTotalMaxPoints() {
		return totalMaxPoints;
	}

	public static void setTotalMaxPoints(int totalMaxPoints) {
		CourseGrade.totalMaxPoints = totalMaxPoints;
	}

	public ArrayList<AssignmentGrade> getAssignmentGrades() {
		return assignmentGrades;
	}

	public void setAssignmentGrades(ArrayList<AssignmentGrade> assignmentGrades) {
		this.assignmentGrades = assignmentGrades;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	

	public Student getStudent() {
		return this.student;
	}

	public Section getSection() {
		return this.section;
	}

	public char calcCourseGrade(int totalMaxPoints) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(student.getPerson() + " ");
		builder.append("grade = ");
		builder.append(grade);				
		return builder.toString();
	}
	
	
}