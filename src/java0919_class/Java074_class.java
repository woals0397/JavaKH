package java0919_class;

class Goods {
	String name;		// 상품명
	int price;			// 상품 가격
	int numberOfStock;	// 상품 재고
	int sold;			// 팔린 수량
	
	public Goods() {
		
	}

	public Goods(String name, int price, int numberOfStock, int sold) {
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	public void prn() {
		System.out.printf("%-15s %8d %5d %5d\n", name, price, numberOfStock, sold);
	}
}

public class Java074_class {
	public static void main(String[] args) {
		/*
		Goods g1 = new Goods("Nikon", 400000, 30, 50);
		Goods g2 = new Goods("Sony", 450000, 20, 35);
		Goods g3 = new Goods("FujiFilm", 350000, 10, 25);
		*/
		Goods[] goodArray = new Goods[3];
		goodArray[0] = new Goods("Nikon", 400000, 30, 50);
		goodArray[1] = new Goods("Sony", 450000, 20, 35);
		goodArray[2] = new Goods("FujiFilm", 350000, 10, 25);
		/*
		for(int i = 0; i < goodArray.length; i++) {
			goodArray[i].prn();	
		}
		*/
		
		display(goodArray);
	}
	
	public static void display(Goods[] goodArray) {
		for(int i = 0; i < goodArray.length; i++) {
			goodArray[i].prn();	
		}
	}
}
