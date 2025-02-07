package com.phone;

public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		String message = "Galaxy " + getVersionNumber() + " says " + getRingTone();
		return message;
	}
	
	@Override 
	public String unlock() {
		String unlock = "Unlocking via fingerprint";
		return unlock;
	}
	
	@Override 
	public void displayInfo() {
		System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());
	}
	
}
