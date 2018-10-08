package java1008_exception;

public class Java158_exception {
	public static void main(String[] args) {
		String data = "991023";
		process(data);
	}

	public static void process(String data) {
		char chk;
		for (int i = 0; i < data.length(); i++) {
			chk = data.charAt(i);
			if (!Character.isDigit(chk))
				try {
					throw new UserException("숫자만 입력하세요");
				} catch (UserException e) {
					// e.printStackTrace();
					System.out.println(e.toString());
					return;
				}
		}
		// 오류발생이 없을때만 실행된다.(catch문에 안걸렸을때)
		System.out.println(data);
	}
}
