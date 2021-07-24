package fixtures;

public abstract class Fixture {

	
	public String name;
	
	public String shortDescription;
	
	public String longDescription;

	public Fixture(String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public Fixture() {
	}

	@Override
	public String toString() {
		return "Fixture [name=" + name + ", shortDescription=" + shortDescription + ", longDescription="
				+ longDescription + "]";
	}

}
