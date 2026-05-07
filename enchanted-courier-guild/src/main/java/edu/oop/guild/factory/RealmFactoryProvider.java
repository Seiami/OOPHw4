package edu.oop.guild.factory;

import java.util.Objects;

import edu.oop.guild.model.RealmType;

public class RealmFactoryProvider {

	public RealmFactory forRealm(RealmType realmType) {
		if (Objects.isNull(realmType)) {
			throw new NullPointerException("Factory realm type cannot be null!");
		}
		
		if(realmType == RealmType.SKY) {
			return new SkyRealmFactory();
		}
		else {
			return new UndergroundRealmFactory();
		}
			
	}
}
