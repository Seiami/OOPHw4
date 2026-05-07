package edu.oop.guild.model;

public enum RealmType {
	SKY,
	UNDERGROUND;

	public String displayName() {
		if (this == SKY) {
			return new String("Sky Kingdom");
		}
		return new String("Underground Market");
	}
}
