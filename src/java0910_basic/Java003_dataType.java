package java0910_basic;

/*
 * 리터널(Literal) : 그 자체의 값(1,2,3..., a,b,c..., true,false)
 * 변수 : 하나의 값을 저장하기 위한 메모리 공간
 * 자료형(data Type) : 값의 종류와 메모리 크기를 결정
 * 자바에서 제공하는 데이터 타입
 * 1. 기본 데이터 타입(primitive data type)
 *    byte(1), short(2), int(4), long(8) => 정수
 *    float(4), double(8) => 실수
 *    char(2) => 문자
 *    boolean(1) => 논리값
 * 2. 참조 데이터 타입(reference data type)
 *    배열(array), 클래스(class), 인터페이스(interface)
 *    
 * 시스템에서 인식하는 데이터 타입의 크기
 *  byte < short,char < int < long < float < double
 */

public class Java003_dataType {
	public static void main(String[] args) {
		//1 int데이터 타입 선언 : 메모리 크기 할당
		//2 data 변수 : 메모리에 접근하기 위한 변수 지정
		//3 3 : data 변수에 3값을 할당(저장)
		int data = 3;
		System.out.println(data);
		
		//data변수에 10값을 할당한다.
		data = 10;
		System.out.println(data);
		
	}// end main()
}// end class
