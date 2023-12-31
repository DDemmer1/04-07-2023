package de.demmer.dennis;

public class Item implements Comparable<Item>{
	
	private double price;
	private String name;
	private int id;

	
	public Item(double price, String name, int id) {
		this.price = price;
		this.name = name;
		this.id = id;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		return "Item [price=" + price + ", name=" + name + ", id=" + id + "]";
	}



	@Override
	public int compareTo(Item otherItem) {
		
		if(this.price < otherItem.getPrice()) {
			return -1;
		}
		
		if(this.price > otherItem.getPrice()) {
			return 1;
		}
			
		
		return 0;
		
	}
	
	
	
	
	
	
	
	
	
	

}
