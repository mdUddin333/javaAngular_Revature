package com.md.model;

public class AirPlane extends FlyingVehicle{

	private short wheels;
	private short propellers;
	
	
	public AirPlane(short wheels, short propellers) {
		super();
		this.wheels = wheels;
		this.propellers = propellers;
	}
	public short getWheels() {
		return wheels;
	}
	public void setWheels(short wheels) {
		this.wheels = wheels;
	}
	public short getPropellers() {
		return propellers;
	}
	public void setPropellers(short propellers) {
		this.propellers = propellers;
	}
	
	public void turn() {
		System.out.println("Turning.........");
	}
	
}
