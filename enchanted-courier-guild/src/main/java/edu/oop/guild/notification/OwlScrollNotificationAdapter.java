package edu.oop.guild.notification;

import java.util.Objects;

import edu.oop.guild.model.DeliveryPlan;

public class OwlScrollNotificationAdapter implements NotificationChannel {
	
	LegacyOwlScroll legacyOwlScroll;

	public OwlScrollNotificationAdapter(LegacyOwlScroll legacyOwlScroll) {
		if (Objects.isNull(legacyOwlScroll)) {
			throw new NullPointerException("Legacy Owl Scroll input to adapter cannot be null!");
		}
		this.legacyOwlScroll = legacyOwlScroll;
	}

	@Override
	public String send(DeliveryPlan plan) {
		if (Objects.isNull(plan)) {
			throw new NullPointerException("Delivery plan input to adapter cannot be null!");
		}
		return legacyOwlScroll.dispatchScroll(plan.getRequestRealmType().displayName(), plan.summary());
	}

}
