package dbenson2750ex3a_domain;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Major {
	private int id;
	private String majorName;
	public Department department;
	public ArrayList<StudentMajor> studentMajors = new ArrayList<StudentMajor>();
	
	

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMajorName() {
		return this.majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public ArrayList<StudentMajor> getStudentMajors() {
		return studentMajors;
	}

	public void setStudentMajors(ArrayList<StudentMajor> studentMajors) {
		this.studentMajors = studentMajors;
	}

	public void addStudentMajor(StudentMajor stMajor) {
		throw new UnsupportedOperationException();
	}

	public StudentMajor getStudentMajor(Student student) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<StudentMajor> getStudentMajors(GregorianCalendar beginDate, GregorianCalendar endDate) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Major [id=");
		builder.append(id);
		builder.append(", majorName=");
		builder.append(majorName);
		builder.append("]");
		return builder.toString();
	}
	
	
}