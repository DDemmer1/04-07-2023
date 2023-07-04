package de.demmer.dennis.aufgabe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Application {
	
	
	public static void main(String[] args) {
		
		Contact c1 = new Contact(499235235, 22, "Albertus Magnus Platz", "7Max Mustermann");
		Contact c3 = new Contact(499246535, 8, "Musterstraße", "1Max Mustermann");
		Contact c2 = new Contact(45678635, 3, "John Doe weg", "9Max Mustermann");
		Contact c4 = new Contact(49923545, 5, "Blablastraße", "5Max Mustermann");
		Contact c5 = new Contact(49924565, 9, "Bahnhofsstraße", "99Max Mustermann");

		
		ArrayList<Contact> list = new ArrayList<Contact>();
		
		
		list.add(c5);
		list.add(c4);
		list.add(c3);
		list.add(c2);
		list.add(c1);
		
		
		for(Contact c : list) {
			System.out.println(c);
		}
		
		Collections.sort(list, new AdressComparator());
		
		System.out.println("---------------");
		
		for(Contact c : list) {
			System.out.println(c);
		}
		
		System.out.println("---------------");
		
		
		
		Collections.sort(list, new PhoneNumberComparator());

		for(Contact c : list) {
			System.out.println(c);
		}
		
		System.out.println("---------------");

		
		Collections.sort(list, new Comparator<Contact>() {
			@Override
			public int compare(Contact o1, Contact o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		
		
		for(Contact c : list) {
			System.out.println(c);
		}
		
		System.out.println("---------------");
		
	}

}
