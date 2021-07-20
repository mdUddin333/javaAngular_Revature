package com.example.model;

public class Whale extends Mammal implements Swimmer{

	@Override
	public void swin() {
		System.out.println("Swim swim swim");
	}

}
