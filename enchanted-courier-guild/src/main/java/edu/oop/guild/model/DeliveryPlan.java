package edu.oop.guild.model;

import edu.oop.guild.creature.Creature;
import java.util.Objects;

public class DeliveryPlan {
	
	private DeliveryRequest request;
	private Creature courier;
	private String sealedLabel;
	private int priceInCoins;

	public DeliveryPlan(DeliveryRequest request, Creature courier, String label, int price) {
		if (Objects.isNull(request)) {
			throw new NullPointerException("Delivery Request cannot be null!");
		}
		this.request = request;
		
		if (Objects.isNull(courier)) {
			throw new NullPointerException("Courier creature cannot be null!");
		}
		this.courier = courier;
		
		if (Objects.isNull(label)) {
			throw new NullPointerException("Sealed label cannot be null!");
		}
		this.sealedLabel = label;
		
		if (price < 0) {
			throw new IllegalArgumentException("Price cannot be less than zero!");
		}
		this.priceInCoins = price;
	}
	
	public DeliveryRequest getRequest() {
		return request;
	}
	
	public RealmType getRequestRealmType() {
		return request.getDestinationRealm();
	}

	public String getCourier() {
		return courier.name();
	}

	public String getSealedLabel() {
		return sealedLabel;
	}

	public int getPriceInCoins() {
		return priceInCoins;
	}
	
	public String summary() {
		return courier.name() + " delivers " + this.sealedLabel + " for " + this.priceInCoins + " coins";
	}

}
