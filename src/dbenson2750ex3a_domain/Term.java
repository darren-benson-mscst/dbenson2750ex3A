package dbenson2750ex3a_domain;
import java.util.ArrayList;

public class Term {
	private int yearTerm;
	private String termName;
	public ArrayList<Section> sections = new ArrayList<Section>();
	
	public Term(int yearTerm, String termName) {
		this.yearTerm = yearTerm;
		this.termName = termName;
	}

	public int getYearTerm() {
		return this.yearTerm;
	}

	public void setYearTerm(int yearTerm) {
		this.yearTerm = yearTerm;
	}

	public String getTermName() {
		return this.termName;
	}

	public void setTermName(String termName) {
		this.termName = termName;
	}

	public void setSections(ArrayList<Section> sections) {
		this.sections = sections;
	}

	

	public void addSection(Section section) {
		throw new UnsupportedOperationException();
	}

	public Section newSection(int sectionNum, int capacity) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Section> getSections() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		builder.append(yearTerm);
		builder.append(", ");
		builder.append(termName);
		builder.append("]");
		return builder.toString();
	}
	
	
}