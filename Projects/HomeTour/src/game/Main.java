package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println();
		System.out.println("Which direction you want go: ");
		
		Room room1=new Room("North room","short description","This is a long description");
		Room room2=new Room("East room","short descrition","A long dining room");
		Room room3=new Room("South room","short description","This is a long description");
		Room room4=new Room("West room","short descrition","A long dining room");
		
		room1.setNorth(room2);
		room2.setEast(room1);
		room3.setSouth(room4);
		room1.setWest(room3);
		
		Room current;
		current=room1;
		String move;
		
		System.out.println("You are in "+current.getNorth());
		System.out.println("The exit is "+current.getExits());
		
		move=input.nextLine();
		
		// All rooms
		if(move.equals("north")) {
			current.getNorth();
		}else if(move.equals("east")) {
			current.getEast();
		}else if (move.equals("south")) {
			current.getSouth();
		}else if (move.equals("west")) {
			current.getWest();
		}else {
			System.out.println("Sorry!!! no room here");
		}
		
	}
	
	private static void printRoom(Player player) {
		System.out.println("You are in "+player);
	}
	
	private static String[] collectInput(){
		
		System.out.println("Enter where you want to go: ");
		String result=input.nextLine();
		return null;
		
	}
	private static void parse(String[] command,Player player) {
		
		
	}
}
