package fixtures;

public abstract class Fixture {

	
	String name="MyFixture";
	
	String shortDescription="A long dining room";
	
	String longDescription="The small entryway of a neo-colonial house."
			+ "A dining room is open to the south, "
			+ "where a large table can be seen. "
			+ "The hardwood floor leads west into doorway,"
			+ "next to a staircase that leads up to a second fllor.";

	public Fixture(String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	@Override
	public String toString() {
		return "Fixture [name=" + name + ", shortDescription=" + shortDescription + ", longDescription="
				+ longDescription + "]";
	}
	
	
	
	
	
}
