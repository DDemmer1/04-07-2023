package de.demmer.dennis.aufgabe;

import java.util.Comparator;

public class AdressComparator implements Comparator<Contact>{

	@Override
	public int compare(Contact o1, Contact o2) {
			
		String ersteAdresse = o1.getAdress();
		String zweiteAdresse = o2.getAdress();

		return ersteAdresse.compareTo(zweiteAdresse);
	}
	
	
	
	
	

}
