package exam;

import java.util.Scanner;

class Product{
	private String name;
	private int price;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String information() {
		return "상품명:" + getName() + "\n가격:" + getPrice() + "원\n수량:" + getQuantity()+"개";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

public class ProductTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name = input.nextLine();
		int price = input.nextInt();
		int quantity = input.nextInt();
		
		Product p = new Product(name, price, quantity);
		System.out.println(p.information());
		System.out.println("총 구매 가격:" + (p.getPrice()*p.getQuantity()));
		input.close();
	}
}
