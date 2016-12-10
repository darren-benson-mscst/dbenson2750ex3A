package dbenson2750ex3a_domain;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Section {
	private int sectionNum;
	private int capacity;
	public Course course;
	public Room room;
	public Instructor instructor;
	public Term term;
	public ArrayList<CourseGrade> courseGrades = new ArrayList<CourseGrade>();
	public ArrayList<Assignment> assignments = new ArrayList<Assignment>();
	
	public Section(Course course, Term term, int sectionNum, int capacity) {
		this.course = course;
		this.term = term;
		this.sectionNum = sectionNum;
		this.capacity = capacity;
	}

	public int getSectionNum() {
		return this.sectionNum;
	}

	public void setSectionNum(int sectionNum) {
		this.sectionNum = sectionNum;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Instructor getInstructor() {
		return this.instructor;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public void setTerm(Term term) {
		this.term = term;
	}

	public void setCourseGrades(ArrayList<CourseGrade> courseGrades) {
		this.courseGrades = courseGrades;
	}

	public void setAssignments(ArrayList<Assignment> assignments) {
		this.assignments = assignments;
	}

	
	public Assignment newAssignment(int unit, char assign, String desc, GregorianCalendar due, int max) {
		Assignment assignment = new Assignment(this, unit, assign, desc, due, max);
		assignments.add(assignment);
		return assignment;
	}

	public Assignment getAssignment(int unit, char assign) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Assignment> getAssignments() {
		return assignments;
	}

	public void setInstructor(Instructor instructor) {
		throw new UnsupportedOperationException();
	}

	public Instructor getInstructor(int id) {
		throw new UnsupportedOperationException();
	}

	public Term getTerm() {
		return this.term;
	}

	public Course getCourse() {
		return this.course;
	}

	public CourseGrade newCourseGrade(Student student, char grade) {
		CourseGrade courseGrade = new CourseGrade(this, student, grade);
		courseGrades.add(courseGrade);
		return courseGrade;
	}

	public CourseGrade getCourseGrade(Student student) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<CourseGrade> getCourseGrades() {
		return courseGrades;
	}

	public int getTotalMaxPoints() {
		throw new UnsupportedOperationException();
	}

	public void setCourseGrades() {
		throw new UnsupportedOperationException();
	}

	public AssignmentGrade newAssignmentGrade(int studentID, int unit, String assign, int points, GregorianCalendar dateCompleted) {
		throw new UnsupportedOperationException();
	}

	public AssignmentGrade newAssignmentGrade(CourseGrade courseGrade, Assignment assign, int points, GregorianCalendar dateCompleted) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();		
		builder.append("   [Section : ");
		builder.append(sectionNum);
		builder.append(", Capacity: ");
		builder.append(capacity);
		builder.append("]");
		return builder.toString();
	}
	
}