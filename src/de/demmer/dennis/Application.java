package de.demmer.dennis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Application {
	
	public static void main(String[] args) {
		
		
		Item i1 = new Item(19.99, "Headset",  9);
		Item i2 = new Item(49.99, "Maus",  5);
		Item i3 = new Item(90.00, "Tastatur",  4);
		Item i4 = new Item(4.99, "USB-Stick",  22);

		
		ArrayList<Item> liste = new ArrayList<>();
		
		liste.add(i1);
		liste.add(i2);
		liste.add(i3);
		liste.add(i4);
		

		for(Item i : liste) {
			System.out.println(i);
		}

		Collections.sort(liste);
		
		
		System.out.println("-----------");
		
		
		for(Item i : liste) {
			System.out.println(i);
		}
		

		
		Collections.sort(liste, new ItemIdComparator());
		
		
	
		System.out.println("----------------");
		
		
		for(Item i : liste) {
			System.out.println(i);
		}
		
		
		
		
	}

}
