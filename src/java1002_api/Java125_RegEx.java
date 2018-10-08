package java1002_api;

public class Java125_RegEx {

	public static void main(String[] args) {
		String sn = "1a234";
		String sb = "2net5";
		String st = "aetwefgcc";
		
		//a-zA-Z_*$가 sn변수에 포함이 되어있으면 true, 아니면 false을 리턴한다
		System.out.println(sn.matches(".*[a-zA-Z_*$].*"));
		
		//sn변수에 0-9가 포함되어있으면 true 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[0-9].*"));
		System.out.println(sn.matches(".*\\d.*"));
		
		//sb변수에 저장된 값이 2로 시작되면 true 아니면 false을 리턴한다.
		System.out.println(sb.matches("2.*"));
		
		//sb변수에 저장된 값이 2로 시작해서 5로 끝나면 true 아니면 false을 리턴한다.
		System.out.println(sb.matches("2.*5"));
		
		System.out.println(sb.matches("[ab].{5,}"));
		
		//st변수에 저장된 문자열이 a또는 b로 시작하고 cc로 끝나면서 
		// 사이에는 임의의문자 최소1개에서5개를 포함한다.
		System.out.println(st.matches("[ab].{1,5}cc"));
	}

}
