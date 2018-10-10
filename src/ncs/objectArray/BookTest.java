package ncs.objectArray;

class Book {
	private String category;
	private String bookName;
	private double bookPrice;
	private double bookDiscountRate;
	
	public Book() {
	
	}
	
	public Book(String category, String bookName, double bookPrice, double bookDiscountRate) {
		this.category = category;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
}


public class BookTest{
	public static void main(String[] args) {
		Book bookArray[] = new Book[5];
		double sum = 0;
		
		bookArray[0] = new Book("IT", "SQL Plus", 50000, 5);
		bookArray[1] = new Book("IT", "Java 2.0", 40000, 3);
		bookArray[2] = new Book("IT", "JSP Servlet", 60000, 6);
		bookArray[3] = new Book("Novel", "davincicode", 30000, 10);
		bookArray[4] = new Book("Novel", "cloven hoof", 50000, 15);
		
		for(int i = 0; i < bookArray.length; i++) {
			System.out.println(bookArray[i].getCategory() + " " + bookArray[i].getBookName() + " " + bookArray[i].getBookPrice() + "원 " + bookArray[i].getBookDiscountRate()+ "%");
			sum += bookArray[i].getBookPrice();
		}
		
		
		System.out.println("\n책 가격의 합:" + sum + "원");
	}
}



