package java0928_binding;

/*
 * 데이터 타입
 * 1 기본 데이터타입 : byte,short,int,long,float,double,boolean,char
 * 2 참조 데이터타입 : array, class, interface
 * 
 * 인자전달방식
 * 1 call by value : 값복사 - 기본 데이터타입
 *    void add(int a, int b){}
 *    add(10, 20);
 * 2 call by reference : 주소복사 -참조 데이터타입
 *   void process(int[] arr){}
 *   process(new int[]{1,2,3});
 *   
 *   
 * 형변환(casting) - 기본 데이터타입
 * 1 묵시적형변환 : 작 -> 큰
 * 2 명시적형변환 : 큰 -> 작   
 *   int num=3;
 *   double data=num; //묵시적형변환
 *   short val=(short)num;  //명시적형변환
 *   
 * 객체형변환-참조데이터타입
 * 1 상속관계일때 형변환이 가능하다.(is a)
 * 2 업캐스팅 발생된후 다운캐스팅을 할 수 있다.
 * 
 *   업캐스팅(up-casting) : 부모객체로 자식객체를 참조하도록 형변환하는 기술
 *   다운캐스팅(down-casting) : 업캐스팅을 다시 원상복귀해주는 형변환하는 기술
 *   
 */

class Parent{
	void process() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	void call() {
		System.out.println("Child call");
	}
	
	@Override
	void process() {
		System.out.println("Child process");
	}
}

class Sun extends Parent{
	void prn() {
		System.out.println("Sun prn");
	}
	
	@Override
	void process() {
		System.out.println("Sun process");
	}
}

class Outer{
	void prn() {
		System.out.println("Outer prn");
	}
}


public class Java109_casting {
	public static void main(String[] args) {
		Parent p = new Parent();
		Outer t = new Outer();
		
		//독립적인 참조데이터타입(객체)은 형변환이 안된다.
		//p=t;
		
		Child c = new Child();
		p=c;  //업캐스팅
		//Parent영역에 process()검색후 -> Child영역에 process()검색을 해서 오버라이딩이 되어 있으면 Child영역에 process()메소드를 실행한다.
		p.process();
		//p.call();   => Child영역에는 존재하는 메소드이지만 Parent영역에는 존재하지 않는 메소드이므로 오류가 발생한다.
		
		//객체생성 및 업캐스팅
		Parent pt = new Child();
		
		//다운캐스팅(down-casting)
		Child cn = (Child)pt;
		cn.process();
		cn.call();
		
		Parent pe = new Sun();
		pe.process();
		//pe.prn();
	}
}
