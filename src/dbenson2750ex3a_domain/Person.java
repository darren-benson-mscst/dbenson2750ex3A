package dbenson2750ex3a_domain;
public class Person {
	private String firstName;
	private String lastName;
	private String mi;
	private String address;
	private String city;
	private String state;
	private String zip;
	public Instructor instructor;
	public Student student;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return this.lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getMi() {
		return this.mi;
	}



	public void setMi(String mi) {
		this.mi = mi;
	}



	public String getAddress() {
		return this.address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getCity() {
		return this.city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return this.state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getZip() {
		return this.zip;
	}



	public void setZip(String zip) {
		this.zip = zip;
	}



	public Instructor getInstructor() {
		return this.instructor;
	}



	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}



	public Student getStudent() {
		return this.student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}




	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("  ");
		builder.append(firstName);
		builder.append(" ");
		builder.append(lastName);		
		return builder.toString();
	}
	
	
}