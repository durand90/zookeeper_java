package com.fanfan.zooker;

public class Mammal {
	private int energyLevel;
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	
	public int getEnergyLevel() {
		System.out.println();
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int displayEnergy() {
		System.out.println(energyLevel);
		return this.energyLevel;
	}
	
//	
}
