package edu.oop.guild.factory;

import edu.oop.guild.model.RealmType;

public class RealmFactoryProvider {

	public RealmFactory forRealm(RealmType realmType) {
		switch(realmType) {
			case SKY:
				return new SkyRealmFactory();
			case UNDERGROUND:
				return new UndergroundRealmFactory();
			default:
				return null;
			
		}
	}

}
