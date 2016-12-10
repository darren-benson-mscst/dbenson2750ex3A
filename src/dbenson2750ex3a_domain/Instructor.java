package dbenson2750ex3a_domain;
import java.util.ArrayList;

public class Instructor {
	private int id;
	public Person person;
	public ArrayList<Section> sections = new ArrayList<Section>();
	
	

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Section> getSections() {
		return sections;
	}

	public void setSections(ArrayList<Section> sections) {
		this.sections = sections;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Person getPerson() {
		return this.person;
	}

	public void addSection(Section section) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Section> getSections(Term term) {
		throw new UnsupportedOperationException();
	}

	public int calcTermCredits(Term term) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Instructor [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}
	
}