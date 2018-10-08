package java1008_exception;

public class Java153_exception {
	public static void main(String[] args) {
		StringBuffer sb = null;
		
		try {
			sb.reverse();
		}catch(NullPointerException ex){
			System.out.println(ex.toString());
		}
		
		System.out.println("program end");
	}
}
