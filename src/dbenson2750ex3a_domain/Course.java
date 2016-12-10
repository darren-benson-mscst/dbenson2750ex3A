package dbenson2750ex3a_domain;
import java.util.ArrayList;

public class Course {
	private String courseNumber;
	private String courseName;
	private int credits;
	public Department department;
	public ArrayList<Section> sections = new ArrayList<Section>();
	
	public Course(Department dept, String courseNumber, String courseName, int credits) {
		this.department = dept;
		this.courseNumber = courseNumber;
		this.courseName = courseName;
		this.credits = credits;
	}

	public String getCourseNumber() {
		return this.courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCredits() {
		return this.credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public ArrayList<Section> getSections() {
		return sections;
	}

	public void setSections(ArrayList<Section> sections) {
		this.sections = sections;
	}

	
	public void addSection(Section section) {
		throw new UnsupportedOperationException();
	}

	public Section newSection(Term term, int sectionNum, int capacity) {
		Section section = new Section(this, term, sectionNum, capacity);
		this.sections.add(section);
		return section;
	}

	public ArrayList<Section> getSections(Term term) {
		throw new UnsupportedOperationException();
	}

	public Section getSection(int sectionNum, Term term) {
		Section section = null;		
		for (Section s : sections){
			if(s.getSectionNum() == sectionNum && s.getTerm().equals(term)){
				section = s;
				break;
			}
		}
		return section;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(courseNumber);
		builder.append(", ");
		builder.append(courseName);
		builder.append(", ");
		builder.append(credits);
		builder.append("]");
		return builder.toString();
	}
	
	
}