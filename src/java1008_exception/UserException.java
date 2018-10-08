package java1008_exception;

// 사용자 정의 예외클래스
public class UserException extends Exception {
	public UserException(String message) {
		super(message);
	}
}
