package dbenson2750ex3a_domain;
import java.util.ArrayList;

public class Building {
	private int id;
	private String name;
	public Campus campus;
	public ArrayList<Room> rooms = new ArrayList<Room>();
	
	

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

	public Campus getCampus() {
		return this.campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public void addRoom(Room room) {
		throw new UnsupportedOperationException();
	}

	public Room getRoom(int id) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Room> getRooms() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Room> getRooms(int capacity) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Building [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
	
}