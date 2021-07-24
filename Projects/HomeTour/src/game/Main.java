package game;

import java.util.Scanner;

import fixtures.Room;


public class Main {
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		
		 RoomManager rm=new RoomManager();
		 rm.init();
		 
		 Player player=new Player();
		 player.currentRoom=rm.startingRoom;
		 
		 printRoom(player);
		 
		 System.out.println("\nExits: ");
		 
		 for(int i=0;i<player.currentRoom.getExits().length;i++) {
			 
			 if(player.currentRoom.getExits()[i]!=null) {
				 System.out.println(player.currentRoom.getExits()[i]+"\n");
			 }
		 }
		 
		 while(!input.equals("no")) {
			 parse(collectInput(),player);
			 input.nextLine().toLowerCase();
		 }
	}
	
	
	public static void printRoom(Player player) {
		 System.out.println("Player's current position "+player.currentRoom);
	 }
	
	public static String[] collectInput() {
		String[] stringArr=new String[2];
		
		System.out.println("Input should be in two words: ");
		String strInput=input.nextLine();
		
		stringArr=strInput.split(" ");
		
		return stringArr;
	}
	
	public static void parse(String[] command,Player player) {
		
		
		Room currentRoom=player.currentRoom;
		
		String act=command[0];
		//String option=command[1];
		
		
		switch (act) {
		case "go":
			player.currentRoom=currentRoom.getExit("north");
			printRoom(player);
			System.out.println("\nExits");
			
			for(int i=0;i<player.currentRoom.getExits().length;i++) {
				if(player.currentRoom.getExits()[i]!=null) {
					System.out.println(player.currentRoom.getExits()[i]+"\n");
				}
			}
			
			break;

		case "exit":
			System.exit(0);
		}
		
		
		
		
		
		
	}
	
}