package java0911_basic;

/*
 * if안에 if
 * if(조건식1){
 * 	 if(조건식2){
 * 		수행할 문장1;
 * 	 }else{
 * 		수행할 문장2;
 * 	 }
 * }else{
 * 	 if(조건식3){
 * 		수행할 문장3;
 * 	 }else{
 * 		수행할 문장4;
 * 	 }
 * }
 */


public class Java019_if {

	public static void main(String[] args) {
		boolean member = false;	// 회원  or 비회원
		String grade = "일반";
		
		// 회원이고 vip고객이면 30%적립, 회원이고 vip고객이 아닐때는 10%적립
		
		// 회원이면
		if(member) {
			if(grade == "vip") { // 회원이면서 vip고객인 경우
				System.out.println("30%적립");
			}else { // 회원이면서 vip고객이 아닌 경우
				System.out.println("10%적립");
			}
		}else { // 비회원이면
			System.out.println("비회원");
		}
		
		System.out.println("고객님 감사합니다.");
		
	}

}



