package dbenson2750ex3a_domain;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Assignment {
	private int unit;
	private char assignment;
	private String description;
	private GregorianCalendar dueDate;
	private int maxPoints;
	public Section section;
	public AssignmentType assignmentType;
	public ArrayList<AssignmentGrade> assignmentGrades = new ArrayList<AssignmentGrade>();

	public Assignment(Section sec, int unit, char assign, String desc, GregorianCalendar due, int max) {
		this.section = sec;
		this.unit = unit;
		this.assignment = assign;
		this.description = desc;
		this.dueDate = due;
		this.maxPoints = max;
	}
	
	public int getUnit() {
		return this.unit;
	}

	public void setUnit(int unit) {
		this.unit = unit;
	}

	public char getAssignment() {
		return this.assignment;
	}

	public void setAssignment(char assignment) {
		this.assignment = assignment;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public GregorianCalendar getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(GregorianCalendar dueDate) {
		this.dueDate = dueDate;
	}

	public Section getSection() {
		return this.section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public AssignmentType getAssignmentType() {
		return this.assignmentType;
	}

	public void setAssignmentType(AssignmentType assignmentType) {
		this.assignmentType = assignmentType;
	}

	public ArrayList<AssignmentGrade> getAssignmentGrades() {
		return this.assignmentGrades;
	}

	public void setAssignmentGrades(ArrayList<AssignmentGrade> assignmentGrades) {
		this.assignmentGrades = assignmentGrades;
	}

	public void setMaxPoints(int maxPoints) {
		this.maxPoints = maxPoints;
	}

	public void addAssignmentGrade(AssignmentGrade assignGrade) {
		throw new UnsupportedOperationException();
	}

	public AssignmentGrade newAssignmentGrade(CourseGrade courseGrade, int points, GregorianCalendar dateCompleted) {
		throw new UnsupportedOperationException();
	}

	public AssignmentGrade getAssignmentGrade(CourseGrade courseGrade) {
		throw new UnsupportedOperationException();
	}

	public double calcAveragePoints() {
		throw new UnsupportedOperationException();
	}

	public int getMaxPoints() {
		return this.maxPoints;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("");
		builder.append(unit);		
		builder.append(assignment);
		builder.append(", ");
		builder.append(description);		
		builder.append(", Points: ");
		builder.append(maxPoints);
		builder.append("]");
		return builder.toString();
	}
}