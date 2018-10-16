package java1016_collection;

public class Java188_Sort {
	public static void main(String[] args) {
		String a = "ABCq2w1";
		String b = "ABC";
		String d = "ABC";
		String e = "ab";
		
		System.out.println(b.compareTo(d));	// 0
		System.out.println(b.compareTo(e));	// 65-97 = -32
		System.out.println(e.compareTo(b));	// 97-65 = 32
		System.out.println(a.compareTo(b));	// 4    -> 앞에 문자들이 같고 길이가 다르면 길이를 비교한다.
		System.out.println(b.compareTo(a));	// -4
	}
}
