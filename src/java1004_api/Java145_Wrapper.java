package java1004_api;

public class Java145_Wrapper {
	public static void main(String[] args) {
		String sn = "korea12 paran3";
		int cnt = 0;
		
		for(int i = 0; i < sn.length(); i++) {
			/*
			char data = sn.charAt(i);
			if(data >= '0' && data <= '9')
				cnt++;
			*/
			
			if(Character.isDigit(sn.charAt(i)))
				cnt++;
		}
		
		System.out.println("숫자갯수:" + cnt);
	}
}
