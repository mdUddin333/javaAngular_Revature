package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		int menuSelection = 0;
		Scanner input=new Scanner(System.in);
		while(menuSelection!=4) {
			System.out.println("Please select an option:\r\n"
					+ "1. Cups to Teaspoons\r\n"
					+ "2. Miles to Kilometers\r\n"
					+ "3. US Gallons to Imperial Gallons\r\n"
					+ "4. Quit");
			menuSelection=input.nextInt();
			// switch statement for whole menu
			switch (menuSelection) {
			case 1:
				System.out.println("Cups to Teaspoons\n\t To see the result press 1.\nTeaspoons to Cups\n\tTo see the result press 2");
				int option1=input.nextInt();
				//nested switch for sub-menu
				switch (option1) {
				case 1:
					System.out.println("48 Teaspoon\n");
					break;
				case 2:
					System.out.println("0.0208333 Cups\n");
					break;

				default:
					System.out.println("You didn't select right option.\n");
					break;
				}
				break;
				
			case 2:
				System.out.println("Miles to Kilometers\n\t To see the result press 1.\nKilometers to Miles\n\tTo see the result press 2");
				int option2=input.nextInt();
				//nested switch for sub-menu
				switch (option2) {
				case 1:
					System.out.println("1.609344 km\n");
					break;
				case 2:
					System.out.println("0.621371 miles\n");
					break;

				default:
					System.out.println("You didn't select right option.\n");
					break;
				}
				break;
				
			case 3:
				System.out.println("US Gallons to Imperial Gallons\n\t To see the result press 1.\nImperial Gallons to Gallons\n\t To see the result press 2.");
				int option3=input.nextInt();
				//nested switch for sub-menu
				switch (option3) {
				case 1:
					System.out.println("0.832674 Imperial Gallons\n");
					break;
				case 2:
					System.out.println("1.20095 Gallons\n");
					break;
				default:
					System.out.println("You didn't select right option.\n");
					break;
				}
				break;
			case 4:
				System.out.println("Thank you for using this application\n");
				break;
			default:
				System.out.println("You didn't select the right option.\nPlease slect the right option from below\n");
				break;
			}

		}		
	}
}
