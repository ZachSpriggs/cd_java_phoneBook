package com.phone;

public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	@Override
	public String ring() {
		String message = "IPhone " + getVersionNumber()+ " says: " + getRingTone();
		return message;
	}
	
	@Override 
	public String unlock() {
		String unlock = "Unlocking via facial recognition";
		return unlock;
	}
	
	@Override 
	public void displayInfo() {
		System.out.println("IPhone " + getVersionNumber() + " from " + getCarrier());
	}
	
}
