package java1012_collection;

public class UserList {
	Object sale[] = new Object[3];
	int point = 0;

	public void add(Object data) {
		if(sale.length==point) {
			Object[] arr=new Object[sale.length*2];
			System.arraycopy(sale,0,arr,0,sale.length);
			sale=arr;
		}
		
		sale[point++] = data;
	}
	
	public int size() {
		return point;
	}
	
	public Object get(int index) {
		return sale[index];
	}
	
	public Object remove(int index) {
		if(index>point)
			throw new ArrayIndexOutOfBoundsException();
		Object obj=sale[index];
		for(int i=index;i<point;i++) {
			sale[i]=sale[i+1];
		}
		point--;
		return obj;
	}
}
