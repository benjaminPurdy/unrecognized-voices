package visibility.unrecognizedvoices.core;

/**
 * Created by benjaminpurdy on 12/14/16.
 */
public class State {
	public State() { }

	private String abbreviation;
	private String name;

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "State{" + "abbreviation='" + abbreviation + '\'' + ", name='" + name + '\'' + '}';
	}
}
