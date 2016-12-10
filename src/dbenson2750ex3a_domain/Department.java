package dbenson2750ex3a_domain;
import java.util.ArrayList;

public class Department {
	private String id;
	private String name;
	public ArrayList<Course> courses = new ArrayList<Course>();
	public ArrayList<Major> majors = new ArrayList<Major>();
	
	

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}

	public void setMajors(ArrayList<Major> majors) {
		this.majors = majors;
	}

	public Department(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public void addCourse(Course course) {
		throw new UnsupportedOperationException();
	}

	public Course newCourse(String courseNum, String courseName, int credits) {
		Course course = new Course(this, courseNum, courseName, credits);
		courses.add(course);
		return course;
	}

	public Course getCourse(String courseNum) {
		Course course = null;
		for (Course c : courses){
			if(c.getCourseNumber().equals(courseNum)){
				course = c;
				break;
			}
		}
		return course;
	}

	public ArrayList<Course> getCourses() {		
		return courses;
	}

	public void addMajor(Major major) {
		throw new UnsupportedOperationException();
	}

	public Major getMajor(int id) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Major> getMajors() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" [");
		builder.append(id);
		builder.append(", ");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
	
}