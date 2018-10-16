package java1016_collection;

import java.util.Comparator;

public class Ascending implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		System.out.println((o1 + "/" + o2 + " ") + o1.compareTo(o2));
		return o1.compareTo(o2);
	}
	
}
