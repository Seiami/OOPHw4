package edu.oop.guild.creature;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.RealmType;

public abstract class Creature {
	
	protected String name;
	protected int carryingCapacityKg;
	protected RealmType nativeRealm;	
	
	public String name() {
		return this.name;
	}

	public int carryingCapacityKg() {
		return this.carryingCapacityKg;
	}

	public RealmType nativeRealm() {
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
