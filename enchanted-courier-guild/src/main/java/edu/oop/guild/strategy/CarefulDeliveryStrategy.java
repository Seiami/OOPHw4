package edu.oop.guild.strategy;

import java.util.Objects;

import edu.oop.guild.model.DeliveryRequest;
import edu.oop.guild.model.PackageType;

public class CarefulDeliveryStrategy implements DeliveryCostStrategy {

		public Integer estimateCoins(DeliveryRequest request) {
			if (Objects.isNull(request)) {
				throw new NullPointerException("The delivery request is null!");
			}
			
			if (request.getPackageType() == PackageType.FOOD) {
				return 28;
			}
			if (request.getPackageType() == PackageType.POTION) {
				return 33;
			}
			if (request.getPackageType() == PackageType.ARTIFACT) {
				return 45;
			}
			
			return null;
		}
}
