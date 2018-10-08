package java0928_binding;

/*
 * 다형성(polymorphism)
 * 1 사전적 의미는 '여러가지 형태를 가질 수 있는 능력'을 의미한다.
 * 2 자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조하는 기술이다.
 *   
 *   void add(Parent a, Parent b){}
 *   
 *    add(new Child(), new Child());
 *    add(new Sun(), new Sun());
 *    
 * 바인딩(binding) : 메소드 호출을 실제 메소드의 몸체와 연결하는 기술이다.
 * 1 정적바인딩(static binding) : 컴파일단계에서 어떤 클래스의 어떤 메소드가 호출되는지 연결하는 기술
 * 2 동적바인딩(dynamic binding) : 실행단게에서 어떤 클래스의 어떤 메소드가 호출되는지 연결하는 기술
 * 
 */


class BindTest extends Object{
	String stn;
	
	 public BindTest() {
		
	}
	 
	 public BindTest(String stn) {
		 this.stn = stn;
	 }
	 
	 @Override
	public String toString() {
		return stn;
	}
}

public class Java110_binding {
	
	public static void main(String[] args) {
		BindTest bt = new BindTest();
		// 정적바인딩
		System.out.println(bt.toString());
		// 생성객체가 BindTest이고 객체 타입도 BindTest이므로 BindTest내에 선언된 toString메소드가 바로 실행된다.
		
		// 업캐스팅 : 부모객체로 자식객체를 가리키는것
		// 다운캐스팅 : 원상복귀시키는것   => 업캐스팅이 발생된 다음에만 사용할 수 있다.
		Object obj = bt; // Object obj = new BindTest();
		// 동적바인딩
		System.out.println(obj.toString());
		// 생성객체는 BindTest이지만 객체 타입이 Object이므로 먼저 Object내에 toString메소드를 찾고 그 하위 클래스에 overriding된 메소드가 있으면 그 메소드를 실행시킨다.
		// 만약 BindTest내에는 존재하는 메소드이나 부모클래스인 Object클래스내에 실행시키고자 하는 메소드가 없으면 오류가 발생한다.
		
		// Object -> String (상속관계)
		process(new String("java")); // Object obj = new String();
		
		// Object -> Number -> Integer (상속관계)
		process(new Integer(10));
	}
	
	// is a(상속관계) -> up-casting(업캐스팅) -> dynamic binding(동적바인딩)
	public static void process(Object obj) {
		System.out.println(obj.toString());	// 동적바인딩
	}
	
}
