package dbenson2750ex3a_domain;
public class AssignmentType {
	private int assignTypeID;
	private String typeDesc;
	public int getAssignTypeID() {
		return assignTypeID;
	}
	public void setAssignTypeID(int assignTypeID) {
		this.assignTypeID = assignTypeID;
	}
	public String getTypeDesc() {
		return typeDesc;
	}
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AssignmentType [assignTypeID=");
		builder.append(assignTypeID);
		builder.append(", typeDesc=");
		builder.append(typeDesc);
		builder.append("]");
		return builder.toString();
	}
	
	
}