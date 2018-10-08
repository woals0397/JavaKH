package java0918_class;

class MemberVar{
	// 멤버변수는 기본값을 제공한다.(JVM에서)
	byte var_byte;	  		// 0
	short var_short;  		// 0
	int var_int;	  		// 0
	long var_long;    		// 0L
	float var_float;  		// 0.0f
	double var_double;		// 0.0
	boolean var_boolean;	// false
	char var_char;			// \u0000
	int[] num;				// null
}

public class Java069_variable {
	public static void main(String[] args) {
		/*
		int num;	// 지역변수-기본값이 제공안됨
		System.out.printf("num:%d\n", num);	  => 오류발생
		*/
		
		MemberVar mv = new MemberVar();
		System.out.printf("var_byte : %d\n", mv.var_byte);    		// 0
		System.out.printf("var_short : %d\n", mv.var_short);  		// 0
		System.out.printf("var_int : %d\n", mv.var_int);      		// 0
		System.out.printf("var_long : %d\n", mv.var_long);    		// 0
		System.out.printf("var_float : %.1f\n", mv.var_float);      // 0.0
		System.out.printf("var_double : %.1f\n", mv.var_double);    // 0.0
		System.out.printf("var_boolean : %b\n", mv.var_boolean);    // false
		System.out.printf("var_char : %c\n", mv.var_char);          // 어떠한값도 저장되지 않은 상태(\u0000)
		System.out.printf("int[] : %s\n", mv.num);  			    // null
	}
}
