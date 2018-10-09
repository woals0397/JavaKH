package Prob;

interface Design{
	void makeWindow();
	void chooseMaterial();
}

class Building{
	private int window;
	private String material;
	
	public Building() {
		
	}
	
	public Building(int window, String material) {
		this.window = window;
		this.material = material;
	}

	public int getWindow() {
		return window;
	}

	public String getDoor() {
		return material;
	}
	
}

class House extends Building implements Design{
	String name;
	
	public House() {
	
	}
	
	public House(int window, String material, String name) {
		super(window, material);
		this.name = name;
	}
	
	@Override
	public void makeWindow() {
		System.out.println(getWindow()+ "개의 창문이 선택되었습니다.");
	}

	@Override
	public void chooseMaterial() {
		System.out.println(getDoor()+ "재료가 선택되었습니다.");
	}

	public void prn() {
		makeWindow();
		chooseMaterial();
		System.out.println(name + "님의 집설계도가 완성되었습니다.");
	}
}

public class Pb {
	public static void main(String[] args) {
		House h1 = new House(2, "벽돌", "홍길동");
		h1.prn();
		
		System.out.println("==============================");
		
		House h2 = new House(1, "콘크리트", "김재민");
		h2.prn();
	}
}
