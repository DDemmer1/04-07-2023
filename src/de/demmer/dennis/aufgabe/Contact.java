package de.demmer.dennis.aufgabe;

public class Contact {

	
	private int phoneNumber;
	private int houseNumber;
	private String adress;
	private String name;
	

	public Contact(int phoneNumber, int houseNumber, String adress, String name) {
		super();
		this.phoneNumber = phoneNumber;
		this.houseNumber = houseNumber;
		this.adress = adress;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", houseNumber=" + houseNumber + ", adress=" + adress + ", name="
				+ name + "]";
	}
	
	
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
}
