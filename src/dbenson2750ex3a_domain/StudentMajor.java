package dbenson2750ex3a_domain;

import java.util.GregorianCalendar;

public class StudentMajor {
	private GregorianCalendar beginDate;
	private GregorianCalendar endDate;
	public Student student;
	public Major major;
	
	

	public GregorianCalendar getBeginDate() {
		return this.beginDate;
	}

	public void setBeginDate(GregorianCalendar beginDate) {
		this.beginDate = beginDate;
	}

	public GregorianCalendar getEndDate() {
		return this.endDate;
	}

	public void setEndDate(GregorianCalendar endDate) {
		this.endDate = endDate;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public Student getStudent() {
		return this.student;
	}

	public Major getMajor() {
		return this.major;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StudentMajor [beginDate=");
		builder.append(beginDate);
		builder.append(", endDate=");
		builder.append(endDate);
		builder.append("]");
		return builder.toString();
	}
	
	
}