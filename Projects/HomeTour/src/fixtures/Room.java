package fixtures;

import java.util.Arrays;

public class Room extends Fixture{

	public Room north;
	public Room east;
	public Room south;
	public Room west;

	
	Room[] exits=new Room[4];
	
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name,shortDescription,longDescription);
		}

	public void setExits(Room[] exits) {
		this.exits = exits;
	}
	
	public Room[] getExits() {
		return this.exits;
		
	}
	public Room getExit(String direction) {

		return null;
	}

	public Room getNorth() {
		return north;
	}

	public void setNorth(Room north) {
		this.north = north;
	}

	public Room getEast() {
		return east;
	}

	public void setEast(Room east) {
		this.east = east;
	}

	public Room getSouth() {
		return south;
	}

	public void setSouth(Room south) {
		this.south = south;
	}

	public Room getWest() {
		return west;
	}

	public void setWest(Room west) {
		this.west = west;
	}

	
	
	
	
}
