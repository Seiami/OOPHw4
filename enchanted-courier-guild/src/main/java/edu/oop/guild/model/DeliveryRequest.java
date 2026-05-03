package edu.oop.guild.model;

public class DeliveryRequest {
	
	private int weightKg;
	private boolean isFragile;
	private PackageType packageType;
	private RealmType destinationRealm;
	private int distanceLeagues;

	public DeliveryRequest(PackageType packageType, int weight, int distance, RealmType destinationRealm, boolean isFragile) {
		this.weightKg = weight;
		this.packageType = packageType;
		this.distanceLeagues = distance;
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
