package java0912_statement;

/*
 * [출력결과]
 * station = "KBS", channel = 7  => 닥터포스터
 * station = "KBS", channel = 9  => 국수의 신
 * station = "MBC"   => 몬스터
 * station = "EBS",  => 한국기행
 */

public class Java024_if {

	public static void main(String[] args) {
		int channel = 9;
		String station = "MBC";
		
		if(station == "KBS") {
			if(channel == 7) {
				System.out.println("닥터포스터");
			}else if(channel == 9){
				System.out.println("국수의 신");
			}else {
				System.out.println("존재하지 않는 channel입니다.");
			}
		}else if(station == "MBC") {
			System.out.println("몬스터");
		}else if(station == "EBS") {
			System.out.println("한국기행");
		}

	}

}
