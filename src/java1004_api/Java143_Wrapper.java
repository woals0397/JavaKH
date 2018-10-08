package java1004_api;

public class Java143_Wrapper {
	public static void main(String[] args) {
		int x = 10;
		double y = 5.8;
		char[] data = {'a', 'b', 'c'};
		
		// String <- 기본데이터
		String a = String.valueOf(x);
		String b = String.valueOf(y);
		String c = String.valueOf(data);
		System.out.printf("%s %s %s\n", a, b, c);
		
		// 기본데이터 <- String
		/*
		String input = "1234";
		Integer it = new Integer(input);
		int num = it.intValue();
		*/
		
		// int <- String
		int k = Integer.parseInt("1234");
		
		// double <- String
		double m = Double.parseDouble("1234");
		
		// float <- String
		float n = Float.parseFloat("1234");
	}
}
