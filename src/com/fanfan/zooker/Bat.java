package com.fanfan.zooker;

public class Bat extends Mammal {
	public Bat() {
		super();
		this.setEnergyLevel(300);
	}
	
	
	public void canFly() {
		System.out.println("flapping");
		this.setEnergyLevel(getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		System.out.println("soo...well, nevermind");
		this.setEnergyLevel(getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("town on fire sound");
		this.setEnergyLevel(getEnergyLevel() - 100);
	}
}
