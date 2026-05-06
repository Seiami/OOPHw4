package edu.oop.guild.notification;

import java.util.Objects;

public class LegacyOwlScroll {
	
	public LegacyOwlScroll() {
		
	}
	
	public String dispatchScroll(String recipient, String inscription) {
		if (Objects.isNull(recipient)) {
			throw new IllegalArgumentException("Recipient cannot be null!");
		}
		if (Objects.isNull(inscription)) {
			throw new IllegalArgumentException("Inscription cannot be null!");
		}
		if (recipient.isBlank()) {
			throw new IllegalArgumentException("Recipient cannot be blank!");
		}
		if (inscription.isBlank()) {
			throw new IllegalArgumentException("Inscription cannot be blank!");
		}
		
		return "Owl scroll sent to " + recipient + ": " + inscription;
	}
}
