package exam;

class Book{
	private String title;
	private String author;
	private int price;
	private String publisher;
	private double discountRate;
	
	public Book() {
	
	}
	
	public Book(String title, String author, int price, String publisher, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate = discountRate;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public double getDiscountRate() {
		return discountRate;
	}
}

public class ex5 {
	public static void main(String[] args) {
		Book bArray[] = new Book[3];
		
		bArray[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1);
		bArray[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		bArray[2] = new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1);
		
		for(int i = 0; i < bArray.length; i++) {
			System.out.println(bArray[i].getTitle()+", " + bArray[i].getAuthor() + ", " + bArray[i].getPublisher() + ", " + bArray[i].getPrice() + "원, " + (int)(bArray[i].getDiscountRate()*100) + "% 할인");
			System.out.println("할인된 가격:" + (int)(bArray[i].getPrice()*(1-bArray[i].getDiscountRate())) + "원");
		}
	}
}
