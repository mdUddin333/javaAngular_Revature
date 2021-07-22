package com.example.exceptions;

public class EvenNumberException extends Exception{

	@Override
	public String getMessage() {
		return " You can't input an even number ";
		
	}
}
