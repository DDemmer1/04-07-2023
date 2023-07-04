package de.demmer.dennis.aufgabe;

import java.util.Comparator;

public class PhoneNumberComparator implements Comparator<Contact>{

	
	
	
//	@Override
//	public int compare(Contact o1, Contact o2) {
//	
//		return o1.getPhoneNumber() - o2.getPhoneNumber();
//	}
//	
	
	
	
	@Override
	public int compare(Contact o1, Contact o2) {
		
		if(o1.getPhoneNumber() > o2.getPhoneNumber()) {
			return 1;
		}
		
		if(o1.getPhoneNumber() < o2.getPhoneNumber()) {
			return -1;
		}
		

		return 0;
	}
	

}
