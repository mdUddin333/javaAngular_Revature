package fixtures;

public class Item extends Fixture {

	public Item(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		
	}

	
	public Item() {
		
	}


	public void setItem(String name,String description,String interact) {
		this.name=name;
		this.shortDescription=description;
		this.longDescription=interact;
	}
}
