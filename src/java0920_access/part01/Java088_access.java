package java0920_access.part01;

public class Java088_access {
	public static void main(String[] args) {
		Java087_access p = new Java087_access();
		// 같은패키지에 있는 클래스
		
		//System.out.printf("var_private=%d\n", p.var_private);
		System.out.printf("var_default=%d\n", p.var_default);
		System.out.printf("var_protected=%d\n", p.var_protected);
		System.out.printf("var_public=%d\n", p.var_public);
	}
}
