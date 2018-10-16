package java1016_collection;

class Box<T>{
	private T data;
	
	public Box() {
		
	}
	
	public Box(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
}

public class Java199_User {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setData(new Integer(10));
		System.out.println(box.getData());
		
		Box<String> box2 = new Box<>("java");
		System.out.println(box2.getData());
	}
}
