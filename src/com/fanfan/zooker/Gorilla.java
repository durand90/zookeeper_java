package com.fanfan.zooker;

public class Gorilla extends Mammal {
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public Gorilla() {
		
	}
		
	public void throwSomething() {
		System.out.println("Gorilla has thrown a banana");
		this.setEnergyLevel(getEnergyLevel()-5);
		
	}
	
	public void eatBananas() {
		System.out.println("Gorilla is full");
		this.setEnergyLevel(getEnergyLevel()+5);
	}
	
	public void climb() {
		System.out.println("Gorilla has climbed a tree");
		this.setEnergyLevel(getEnergyLevel()-10);
	}
}
