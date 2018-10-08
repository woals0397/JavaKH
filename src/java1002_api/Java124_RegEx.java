package java1002_api;
/*
 * 정규식(Regular Expression)
 * 1 정규식이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해
 *  사용하는 것으로 미리 정의된 기호와 문자를 이용해서 작성한 문자열을 말한다.
 *  정규화 표현식
 */
public class Java124_RegEx {

	public static void main(String[] args) {
		String sn="java korea";
		String sg="";
		String st="java     korea";
		//j_v_ ko_e_
		for(int i=0;i<sn.length();i++) {
			if(sn.charAt(i)=='a' || sn.charAt(i)=='r') 
				sg+='_';//문자열로 바뀜
			else
				sg+=sn.charAt(i);
		}
		System.out.println(sg);
		
		System.out.println("regular expression을 이용한 문자변경");
		//[]대괄호는 or를 의미한다.
		//sn변수에 저장된 문자열에서 a이거나r이면 "_"로 변경한다.
		System.out.println(sn.replaceAll("[ar]"/*or의미*/, "_"));
		//sn변수에 저장된 문자열에서 a이거나 r이 포함되면 true 아니면 false을 리턴한다 
		System.out.println(sn.matches(".*[vr].*"));// .임의의 문자 *여러개 []는 or의 의미
		//sn변수에 저장된 문자열에서 a이거나 r로 시작되면 true 아니면 false을 리턴한다
		System.out.println(sn.matches("[ar].*"));//false
		//sn변수에 저장된 문자열에서 a이거나 r로 끝나면 true 아니면 false을 리턴한다
		System.out.println(sn.matches(".*[ar]"));//true
		//{2,3}2개부터 3개까지의 공백을"@"으로 변경한다.
		System.out.println(st.replaceAll("\\s{2,3}", "@"));// \s(공백)이 {2,3}2개이거나 3개이면 {2,}(2개이상이면)

	}
}	
