package game;

import fixtures.Room;

public class RoomManager {

	
	Room startingRoom;
	public Room[] rooms=new Room[6];
	
	public void init() {
		Room foyer=new Room("The Foyer","a small foyer","The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." +
							"\n"+"The hardwood floor leads west into doorway, next to a staircase that leads up to a second floor."+"\n"+
							"To the north is a small room, where you can see a piano.");
	
		this.rooms[0]=foyer;
		this.startingRoom=foyer;
		
		//1st bedroom
		Room bedroom1=new Room("Bedroom1","This is the 1st bedroom","This bedroom is one of the smallest bedroom in this house");
		
		this.rooms[1]=bedroom1;
		foyer.setExit(bedroom1, "north");
		bedroom1.setExit(foyer, "east");
		bedroom1.getItem().setItem("Queens bed", "this bed has two pillow", "You can take a rest here and good sleep.");
		
		
		// 2nd bedroom
		Room masterBedroom=new Room("Master Bedroom", "This is the master bedroom in this house", "This master bedroom has one big toilet here and this bedroom size is 20 feet by 19 feet");
		
		this.rooms[2]=masterBedroom;
		bedroom1.setExit(foyer, "south");
		masterBedroom.setExit(bedroom1, "west");
		masterBedroom.getItem().setItem("toilet", "bathroom has toilet and has a shower bath", null);
		//3rd room
		Room livingRoom=new Room("Living room", "This is the only living room in this house", "This Living room is one of the bigest room in this house.");
		
		this.rooms[3]=livingRoom;
		masterBedroom.setExit(livingRoom, "east");
		livingRoom.setExit(bedroom1, "north");
		livingRoom.getItem().setItem("couch", "very soft couch", "You can sit and lay down in this soft couch.");
		//Kitchen
		Room kitchen=new Room("Kitchen", "This is the only kitchen in this house", "This kitchen room has a lot of cooking stuff and all are working fine.");
		
		this.rooms[4]=kitchen;
		livingRoom.setExit(kitchen, "west");
		kitchen.setExit(masterBedroom, "south");
		kitchen.getItem().setItem("Bunner", "it has a pan", "You can cook here");
	
	}
	
}
