package java1015_collection.prob;
import java.io.File;
import java.util.Scanner;
import java.util.Vector;

/*
 * [문제] : booklist.txt 파일의 데이터를 이용하여 
 *      책 정보 하나당 하나의 Book 객체를 생성하고 생성된 Book 객체들을 
 *      Vector에 담아서 리턴하는 makeBookList() 메서드를 구현하시오.
 *      
 * [실행결과]
 * Java Programming 의 가격 : 25000
 * SQL Fundamentals 의 가격 : 47000
 * JDBC Programming 의 가격 : 30000
 * Servlet Programming 의 가격 : 20000
 * JSP Programming 의 가격 : 21000
 */
public class Prob001_Vector {

	public static void main(String[] args) throws Exception {
		Vector<Book> bookList = makeBookList();
		for (Book book : bookList) {
			System.out.println(book.getTitle() + " 의 가격 : " + book.getPrice());
		}

	}// end main()

	private static Vector<Book> makeBookList() throws Exception {
		// booklist.txt 파일의 데이터를 Vector에 저장한 후 리턴하는 프로그램을 구현하시오.
		File file = new File("src/java1015_collection/prob/booklist.txt");
		Scanner sc = new Scanner(file);
		Vector<Book> vc = new Vector<Book>();
		
		while(sc.hasNextLine()) {
			String[] stn = sc.nextLine().split("/");
			Book b = new Book(stn[0], stn[1], stn[2], stn[3]);
			vc.add(b);
		}
		
		sc.close();
		return vc;

	}// end makeBookList()

}// end class















