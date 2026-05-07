package edu.oop.guild.model;

public enum PackageType {
	FOOD,
	POTION,
	ARTIFACT;

	public String label() {
    	if (this == FOOD) {
    		return new String("Snack crate");
    	}
    	else if (this == POTION) {
    		return new String("Potion case");
    	}
    	return new String("Ancient artifact");
	}
}
