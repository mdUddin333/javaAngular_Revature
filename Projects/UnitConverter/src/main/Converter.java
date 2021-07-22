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
					System.out.println("1 Cup=48 Teaspoon\n");
					System.out.println("Please enter your Cups ");
					int cups=input.nextInt();
					int cal=cups*48;
					System.out.println("This is your "+cal+" Teaspoons");
					break;
				case 2:
					System.out.println("1 Teaspoons=0.0208333 Cups\n");
					System.out.println("Please enter your Teaspoons ");
					double teaspoons=input.nextDouble();
					double Teaspoonscal=teaspoons*0.0208333;
					System.out.println("This is your "+Teaspoonscal+" Cups");
					
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
					System.out.println("1 Miles=1.609344 km\n");
					System.out.println("Please enter your Miles ");
					double kilometers=input.nextDouble();
					double kilometersResult=kilometers*1.609344;
					System.out.println("This is your "+kilometersResult+" Kilometers");
					
					break;
				case 2:
					System.out.println("1 Kilometer=0.621371 miles\n");
					System.out.println("Please enter your Kilometers ");
					double miles=input.nextDouble();
					double milesResult=miles*0.621371;
					System.out.println("This is your "+milesResult+" Miles");
		
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
					System.out.println("1 US Gallon=0.832674 Imperial Gallons\n");
					System.out.println("Please enter your US Gallons ");
					double usGallon=input.nextDouble();
					double usGallonResult=usGallon*0.832674;
					System.out.println("This is your "+usGallonResult+" Imperial Gallons");
		
					break;
				case 2:
					System.out.println("1 Imperial Gallon=1.20095 Gallons\n");
					System.out.println("Please enter your Imperial Gallons ");
					double imperialGallon=input.nextDouble();
					double imperialGallonResult=imperialGallon*1.20095;
					System.out.println("This is your "+imperialGallonResult+" US Gallons");
		
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
