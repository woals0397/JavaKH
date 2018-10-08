package java1001_api;

/*
 * [출력결과]
 *  홍길동님은 남성입니다.
 *  응삼이님은 여성입니다.
 *  잘못입력하셨습니다.
 */
public class Java123_String {

	public static void main(String[] args) {
		String p1 = "홍길동,561203-1597650";
		String p2 = "응삼이,030628-4056892";
		String p3 = "갑동이,900824-8052582";
		display(p1);
		display(p2);
		display(p3);
	}// end main( )

	public static void display(String str) {
		// 여기를 구현하세요.
		String[] temp = str.split(",");
		if(temp[1].charAt(7) == '1' || temp[1].charAt(7) == '3') {
			System.out.println(temp[0] + "님은 남성입니다.");
		}else if(temp[1].charAt(7) == '2' || temp[1].charAt(7) == '4'){
			System.out.println(temp[0] + "님은 여성입니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
	}// end display()

}// end class




