package java0910_basic;

public class Java004_casting {
	public static void main(String[] args) {
		int num = 3;
		double data = 4.5;
		
		int jumsu = num;
		
		// 형변환(casting)
		// 묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할때 발생
		long ko = (long)4; // (long)를 써주지 않아도 알아서 형변환이 일어난다.
		System.out.println(ko);
		
		// int = double (캐스팅 타입 명시)
		// 명시적 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할때 발생
		int na = (int)3.2;
		System.out.println(na);
		
		byte small = (byte)130; // 범위 주의하며 사용
		System.out.println(small);
		
		byte small2 = 127; // int값을 int보다 작은 것들에 넣을때는 캐스팅을 따로 안해도 된다.
		System.out.println(small2);
		
		char alpa = 'a';
		System.out.println(alpa);
		
		/*
		 * 유니코드 : 
		 *  'a' : 97
		 *  'A' : 65
		 *  '0' : 48
		 */
		alpa = 97;
		System.out.println(alpa);
		
		byte adata = 3;
		short sdata = 4;
		long ndata = 5L; // 5l
		float fdata = 4.3F; // 4.3f
		boolean bdata = true; // false
		
		/*
		 * 1 변수의 데이터 타입과 값의 데이터 타입을 일치시킨다.
		 * 2 변수와 값의 데이터 타입이 일치가 안될때는 형변환을 한다.
		 * 3 int타입의 값을 byte, short, char에 대입을 할때는 형변환이 필요없다.
		 */
	}
}
