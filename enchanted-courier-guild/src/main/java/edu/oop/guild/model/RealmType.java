package edu.oop.guild.model;

public enum RealmType {
	SKY,
	UNDERGROUND;

	Object displayName() {
		switch(this) {
	    	case SKY:
	    		return new String("Sky Kingdom");
	    	case UNDERGROUND:
	    		return new String("Underground Market");
			default:
				return null;
		    }
	}
}
