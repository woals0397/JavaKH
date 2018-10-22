package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Goods {
	private String name;
	private int price;
	private int quantity;

	public Goods() {

	}

	public Goods(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String toString() {
		return name + ", " + price + "원, " + quantity + "개\n총 구매 가격 :" + (price*quantity) + "원";
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

public class GoodsTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		Goods goods = new Goods();

		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("다음 항목의 값을 입력하시오.");
		try {
			System.out.print("상품명:");
			String name = br.readLine();
			goods.setName(name);
			System.out.print("가격:");
			int price = Integer.parseInt(br.readLine());
			goods.setPrice(price);
			System.out.print("수량:");
			int quantity = Integer.parseInt(br.readLine());
			goods.setQuantity(quantity);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("입력된 결과는 다음과 같습니다.");
			System.out.println(goods.toString());
		}
	}
}
