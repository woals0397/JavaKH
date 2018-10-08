package java0910_basic;

public class Java009_operator {

	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		
		// 전위형 : 값이 참조되기 전에 증가시킨다.
		// i변수의 값을 1증가 시키고 j변수에 대입한다.
		//j = ++i;
		
		// 후위형 : 값이 참조된 후에 증가시킨다.
		// i변수의 값을 j변수에 대입한 후 i변수를 1증가한다.
		j = i++;
		
		System.out.println("i = " +i);
		System.out.println("j = " +j);
	}

}
