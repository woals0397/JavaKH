package exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

class Decending implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		return ((Integer)o1).compareTo(((Integer)o2));
	}
	
}

public class ListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random ran = new Random();
		
		for(int i = 0; i < 10; i++) {
			list.add(ran.nextInt(100)+1);
		}
		
		System.out.print("정렬전: ");
		display(list);
		
		list.sort(new Decending());
		
		System.out.print("\n정렬후: ");
		display(list);
		
	}
	
	public static void display(List list) {
		for(Object n : list)
			System.out.print(n + "  ");
	}
}
