package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book15{
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	public Book15() {
	
	}

	public Book15(String title, String author, int price, String publisher, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}
	
	public String toString() {
		return title + ", " + author + ", " + publisher + ", " + price + ", " + (discountRate*100) + "% 할인\n할인된 가격 :" + (price-(int)(price*discountRate)) + "원";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}	

public class BookListTest {
	public static void main(String[] args) {
		BookListTest test5 = new BookListTest();
		ArrayList<Book15> list = new ArrayList<>();
		
		test5.storeList(list);
		
		test5.saveFile(list);
		
		List<Book15> booksList = test5.loadFile();
		
		test5.printList(booksList);
	}
	
	public void storeList(List<Book15> list) {
		list.add(new Book15("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book15("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book15("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1));
	}
	
	public void saveFile(List<Book15> list) {
		File file = new File("books.dat");
		FileWriter fw = null;
		
		for(int i = 0; i < list.size(); i++) {
			try {
				fw = new FileWriter(file, true);
				fw.write(list.get(i).getTitle()+ "/" + list.get(i).getAuthor()+ "/" + list.get(i).getPrice()+ "/" + list.get(i).getPublisher()+ "/" + list.get(i).getDiscountRate() + "\r\n");
				fw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	
	}
	
	public List<Book15> loadFile(){
		File file = new File("books.dat");
		List<Book15> re = new ArrayList<>();
		
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String[] dat = sc.nextLine().split("/");
				re.add(new Book15(dat[0], dat[1], Integer.parseInt(dat[2]), dat[3], Double.parseDouble(dat[4])));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return re;
	}
	
	public void printList(List<Book15> list) {
		for(Book15 b : list) {
			System.out.println(b.toString());
		}
	}
}
