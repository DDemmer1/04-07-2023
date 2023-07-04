package de.demmer.dennis;

import java.util.Comparator;

public class ItemIdComparator implements Comparator<Item>{

	@Override
	public int compare(Item i1, Item i2) {
		
		if(i1.getId() > i2.getId()) {
			return 1;
		}
		
		if(i1.getId() < i2.getId()) {
			return -1;
		}
		
		
		return 0;
		//Wenn man nach string sortieren will
//		return i1.getName().compareTo(i2.getName());
	}
	
	
	

}
