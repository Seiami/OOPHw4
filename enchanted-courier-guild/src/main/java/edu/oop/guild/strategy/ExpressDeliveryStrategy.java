package edu.oop.guild.strategy;

import java.util.Objects;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.RealmType;

public class ExpressDeliveryStrategy implements DeliveryCostStrategy {

	public Integer estimateCoins(DeliveryRequest request) {
		
		if (Objects.isNull(request)) {
			throw new NullPointerException("The delivery request is null!");
		}
		
		Integer price = 47;
		
		if (request.isFragile()) price += 10;
		if (request.getDestinationRealm() == RealmType.UNDERGROUND) price += 10;
	
		return price;
	}
}
