import java.util.Scanner;

public class ExampleOne {

	public static void main(String[] args) {


		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your line here ");
		String line=input.nextLine();
		System.out.println("You have typed :"+line);
		input.close();
		
		String num="1 2 3 4 5 6 7 8 9";
		input=new Scanner(num);
		while(input.hasNextInt()) {
			System.out.print(input.nextInt());
		}
		input.close();
	}

}
