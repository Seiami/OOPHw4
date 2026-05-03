package edu.oop.guild.model;

public enum PackageType {
	FOOD,
	POTION,
	ARTIFACT;

	Object label() {
	switch(this) {
    	case FOOD:
    		return new String("Snack crate");
    	case POTION:
    		return new String("Potion case");
    	case ARTIFACT:
    		return new String("Ancient artifact");
		default:
			return null;
	    }
	}
}
