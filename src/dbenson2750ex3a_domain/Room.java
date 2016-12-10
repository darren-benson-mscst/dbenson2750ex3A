package dbenson2750ex3a_domain;
import java.util.ArrayList;

public class Room {
	private int id;
	private String number;
	private int capacity;
	public Building building;
	public ArrayList<Section> sections = new ArrayList<Section>();
	
	

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Building getBuilding() {
		return this.building;
	}

	public void setBuilding(Building building) {
		this.building = building;
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

	public Section getSection(int sectionNum, Term term) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Section> getSections(Term term) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Room [id=");
		builder.append(id);
		builder.append(", number=");
		builder.append(number);
		builder.append(", capacity=");
		builder.append(capacity);
		builder.append("]");
		return builder.toString();
	}
	
	
}