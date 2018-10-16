package java1016_collection;

// Number를 상속받거나 Number타입의 객체만 받을수 있다.
// 만약 명시해주지 않으면 String등 숫자가 아닌값이 들어올수 있어서 findAverage메소드에서 에러가 발생한다.
class Average<T extends Number>{
	private T[] list;
	
	public Average() {}
	
	public Average(T[] list) {
		this.list = list;
	}
	
	public double findAverage() {
		double sum = 0.0;
		for(T data : list) {
			sum += data.doubleValue();
		}
		return sum/list.length;
	}
}

public class Java200_User {
	public static void main(String[] args) {
		Integer it[] = new Integer[] {1,5,3,2};
		Average<Integer> av = new Average<>(it);
		System.out.println(av.findAverage());
		
		// String은 Number와 관련없는 타입이다.
		//Average<String> ae = null;
		
		Number[] nb = new Number[] {2, 5.3f, 4.5};
		Average<Number> aa = new Average<Number>(nb);
		System.out.printf("%.1f\n", aa.findAverage());
	}
}
