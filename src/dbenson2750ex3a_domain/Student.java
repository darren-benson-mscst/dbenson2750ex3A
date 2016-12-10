package dbenson2750ex3a_domain;
import java.util.ArrayList;

public class Student {
	private int id;
	public Person person;
	public ArrayList<CourseGrade> courseGrades = new ArrayList<CourseGrade>();
	public ArrayList<StudentMajor> studentMajors = new ArrayList<StudentMajor>();
	
	

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public ArrayList<CourseGrade> getCourseGrades() {
		return courseGrades;
	}

	public void setCourseGrades(ArrayList<CourseGrade> courseGrades) {
		this.courseGrades = courseGrades;
	}

	public void setStudentMajors(ArrayList<StudentMajor> studentMajors) {
		this.studentMajors = studentMajors;
	}

	public Student(int id, Person person) {
		this.id = id;
		this.person = person;
		this.person.setStudent(this);
	}

	public double calculateGPA() {
		throw new UnsupportedOperationException();
	}

	public void addStudentMajor(StudentMajor stMajor) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<StudentMajor> getStudentMajors() {
		throw new UnsupportedOperationException();
	}

	public int getTotalPoints() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" [");
		builder.append(id);
		builder.append(" ");
		builder.append(this.person.toString());
		builder.append("]");
		return builder.toString();
	}
	
}