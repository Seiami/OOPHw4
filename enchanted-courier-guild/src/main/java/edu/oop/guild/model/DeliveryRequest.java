package edu.oop.guild.model;

public class DeliveryRequest {
	
	private int weightKg;
	private boolean isFragile;
	private PackageType packageType;
	private RealmType destinationRealm;
	private int distanceLeagues;

	public DeliveryRequest(PackageType packageType, int weight, int distance, RealmType destinationRealm, boolean isFragile) {
		if (weight <= 0) {
			throw new IllegalArgumentException("DeliveryRequest weight must be greater than zero.");
		}
		this.weightKg = weight;
		
		if (packageType == null) {
			throw new NullPointerException("PackageType cannot be null!");
		}
		this.packageType = packageType;
		
		if (distance <= 0) {
			throw new IllegalArgumentException("DeliveryRequest distance must be greater than zero.");
		}
		this.distanceLeagues = distance;
		
		if (destinationRealm == null) {
			throw new NullPointerException("Destination Realm cannot be null!");
		}
		this.destinationRealm = destinationRealm;
		
		this.isFragile = isFragile;
	}


	public int getWeightKg() {
		return weightKg;
	}

	public RealmType getDestinationRealm() {
		return destinationRealm;
	}

	public boolean isFragile() {
		return isFragile;
	}

	public PackageType getPackageType() {
		return packageType;
	}

	public int getDistanceLeagues() {
		return distanceLeagues;
	}
	
}
