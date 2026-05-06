package edu.oop.guild.strategy;

import java.util.Objects;

import edu.oop.guild.model.DeliveryRequest;

public class StandardDeliveryStrategy implements DeliveryCostStrategy {
	
	public Integer estimateCoins(DeliveryRequest request) {
		if (Objects.isNull(request)) {
			throw new NullPointerException("The delivery request is null!");
		}
		
		if (request.isFragile()) {
			return 26;
		}
		return 21;
	}

}
