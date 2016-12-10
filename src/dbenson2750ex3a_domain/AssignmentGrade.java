package dbenson2750ex3a_domain;

import java.util.GregorianCalendar;

public class AssignmentGrade {
	private int points;
	private GregorianCalendar dateCompleted;
	public Assignment assignment;
	public CourseGrade courseGrade;

	public GregorianCalendar getDateCompleted() {
		return this.dateCompleted;
	}

	public void setDateCompleted(GregorianCalendar dateCompleted) {
		this.dateCompleted = dateCompleted;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}

	public void setCourseGrade(CourseGrade courseGrade) {
		this.courseGrade = courseGrade;
	}

	public AssignmentGrade(int points, GregorianCalendar date, Assignment assign, CourseGrade courseGrade) {
		throw new UnsupportedOperationException();
	}

	public CourseGrade getCourseGrade() {
		return this.courseGrade;
	}

	public Assignment getAssignment() {
		return this.assignment;
	}

	public int getPoints() {
		return this.points;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AssignmentGrade [points=");
		builder.append(points);
		builder.append(", dateCompleted=");
		builder.append(dateCompleted);
		builder.append("]");
		return builder.toString();
	}
	
}