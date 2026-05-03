package edu.oop.guild.creature;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.RealmType;

public abstract class Creature {
	
	protected String name;
	protected int carryingCapacityKg;
	protected RealmType nativeRealm;	
	
	public static String name(Creature c) {
		return c.getName();
	}
	
	protected String getName() {
		return this.name;
	}

	public static int carryingCapacityKg(Creature c) {
		return c.getCarryingCapacityKg();
	}

	protected int getCarryingCapacityKg() {
		return this.carryingCapacityKg;
	}

	public static RealmType nativeRealm(Creature c) {
		return c.getNativeRealm();
	}
	
	protected RealmType getNativeRealm() {
		return this.nativeRealm;
	}

	protected boolean canCarry(DeliveryRequest request) {
		if (request == null) {
			throw new NullPointerException("The DeliveryRequest is null!");
		}
		if (request.getWeightKg() > this.carryingCapacityKg) {
			return false;
		}
		if (request.getDestinationRealm() != this.nativeRealm) {
			return false;
		}
		return true;
	}
	
	

}
