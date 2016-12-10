package dbenson2750ex3a_domain;
import java.util.ArrayList;

public class Campus {
	private int id;
	private String name;
	public ArrayList<Building> buildings = new ArrayList<Building>();
	
	

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBuildings(ArrayList<Building> buildings) {
		this.buildings = buildings;
	}

	public void addBuilding(Building building) {
		throw new UnsupportedOperationException();
	}

	public Building getBuilding(int bldgId) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Building> getBuildings() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Campus [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
}