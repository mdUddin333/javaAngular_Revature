package game;

import fixtures.Room;

public class RoomManager {

	
	Room startingRoom;
	public Room[] rooms;
	
	public void init() {
		Room foyer=new Room("The Foyer","a small foyer","The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." +
							"\n"+"The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor."+"\n"+
							"To the north is a small room, where you can see a piano.");
	
		rooms=new Room[4];
		this.rooms[3]=foyer;
		
		Room north=new Room("North","short description","This is a very long description ");
		Room east=new Room("East","short description","This is a very long description ");
		Room south=new Room("South","short description","This is a very long description ");
		Room west=new Room("West","short description","This is a very long description ");
		
		rooms[0]=north;
		rooms[1]=east;
		rooms[2]=south;
		rooms[3]=west;

		north.getExit("north");
		east.getExit("east");
		south.getExit("south");
		west.getExit("west");
		this.startingRoom=foyer;
			
	}
	public Room[] getAllRomms() {
		
		return rooms;
	}
}
