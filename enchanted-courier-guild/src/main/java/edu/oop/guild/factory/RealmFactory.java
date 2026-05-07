package edu.oop.guild.factory;

import edu.oop.guild.creature.Creature;
import edu.oop.guild.seal.PackageSeal;

public interface RealmFactory {	
	public PackageSeal createSeal();
	public Creature createCourier();
}
