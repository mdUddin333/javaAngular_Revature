package com.example.exceptions;

import java.util.Scanner;

public class Simulation {

	public static void main(String[] args) {

		getInput();
	}

	public static void getInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Type in a number and press Enter...");
        String line = input.nextLine();
        System.out.println("You've typed: " + line);

        if (isEven(line)) {
            try {
                throw new EvenNumberException();
            }catch (EvenNumberException e) {
                e.printStackTrace();
            }finally {
                input.close();
            }
        }
        input.close();
    }
	
	public static boolean isEven(String num) {
		int value=Integer.parseInt(num);
		return (value%2==0);
	}
}
