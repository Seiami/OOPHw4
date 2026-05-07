package edu.oop.guild.factory;

import edu.oop.guild.creature.Creature;
import edu.oop.guild.seal.PackageSeal;

public interface RealmFactory {	
//	public static PackageSeal createSeal(RealmFactory rf) {
//		if(rf == null) return null;
//		return rf.createSeal();
//	}
//	
//	public static Creature createCourier(RealmFactory rf) {
//		if(rf == null) return null;
//		return rf.createCourier();
//	}
	
	public PackageSeal createSeal();
	public Creature createCourier();
}
