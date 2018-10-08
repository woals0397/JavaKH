package java0920_access.part02;

import java0920_access.part01.Java087_access;

public class Java089_access extends Java087_access{	// 상속(extends)
	public static void main(String[] args) {
		Java089_access p = new Java089_access();

		//System.out.printf("var_private=%d\n", p.var_private);
		//System.out.printf("var_default=%d\n", p.var_default);
		System.out.printf("var_protected=%d\n", p.var_protected);
		System.out.printf("var_public=%d\n", p.var_public);
	}
}
