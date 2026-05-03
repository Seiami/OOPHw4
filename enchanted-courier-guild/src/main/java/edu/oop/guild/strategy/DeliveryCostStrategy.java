package edu.oop.guild.strategy;

import edu.oop.guild.model.DeliveryRequest;

public interface DeliveryCostStrategy {

	Integer estimateCoins(DeliveryRequest request);

}
