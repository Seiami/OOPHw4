package edu.oop.guild.service;

import edu.oop.guild.factory.RealmFactory;
import edu.oop.guild.model.DeliveryPlan;
import edu.oop.guild.log.GuildLog;
import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.strategy.DeliveryCostStrategy;

public class DeliveryPlanner {
	
	private RealmFactory realmFactory = null;
	private DeliveryCostStrategy deliveryCostStrategy = null;
	private GuildLog logInstance;

	public DeliveryPlanner(RealmFactory realmFactory, DeliveryCostStrategy deliveryCostStrategy, GuildLog instance) {
		if(realmFactory == null || deliveryCostStrategy == null || instance == null) throw new NullPointerException();
		this.realmFactory = realmFactory;
		this.deliveryCostStrategy = deliveryCostStrategy;
		this.logInstance = instance;
	}

	public DeliveryPlan plan(DeliveryRequest request) {
		if(request == null) throw new NullPointerException();
		
		if(request.getDestinationRealm() != realmFactory.createCourier().nativeRealm())
			throw new IllegalStateException();
		
	    String label = request.getPackageType().label() + " to " + request.getDestinationRealm().displayName();
	    
		DeliveryPlan dPlan =  new DeliveryPlan(request, 
								realmFactory.createCourier(), 
								realmFactory.createSeal().apply(label), 
								deliveryCostStrategy.estimateCoins(request));
		
		logInstance.record(dPlan.summary());
		return dPlan;
	}

}
