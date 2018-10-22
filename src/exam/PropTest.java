package exam;

import java.util.Properties;

class Fruit{
	private String name;
	private int price;
	private int quantity;
	
	public Fruit() {
	
	}

	public Fruit(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString() {
		return null;
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

public class PropTest {
	public static void main(String[] args) {
		
	}
	
	public void fileSave(Properties p) {
		
	}
	
	public void fileOpen(Properties p) {
		
	}
}
