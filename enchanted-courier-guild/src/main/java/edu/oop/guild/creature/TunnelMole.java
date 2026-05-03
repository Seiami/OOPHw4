package edu.oop.guild.creature;

import edu.oop.guild.model.RealmType;

public class TunnelMole extends Creature {

	public TunnelMole() {
		this.name = "Grumble the Tunnel Mole";
		this.carryingCapacityKg = 30;
		this.nativeRealm = RealmType.UNDERGROUND;
	}

}
