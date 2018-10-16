package java1016_collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Java194_TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<>();
		tree.add(new Integer(10));
		tree.add(new Integer(40));
		tree.add(new Integer(20));
		tree.add(new Integer(30));
		tree.add(new Integer(20));
		
		// 오름차순
		/*
		for(Integer it : tree)
			System.out.println(it);
		*/
		
		Iterator<Integer> ita = tree.iterator();
		while(ita.hasNext())
			System.out.println(ita.next());
		
		System.out.println("///////////////////////////");
		
		// 내림차순
		Iterator<Integer> ite = tree.descendingIterator();
		while(ite.hasNext())
			System.out.println(ite.next());
	}
}
