package java0927_abstract_interface;

/*
 * 피아노 연주하다. => 손가락
 * 플릇 연주하다.  => 입
 */

abstract class Instrument{
	String name;
	
	public Instrument() {
		
	}
	
	public Instrument(String name) {
		this.name = name;
	}
	
	abstract void play();
}


class Piano extends Instrument{
	public Piano() {
	
	}
	
	public Piano(String name) {
		super(name);
	}
	
	@Override
	void play() {
		System.out.println("손가락으로 누른다.");
	}
}

class Flute extends Instrument{
	public Flute() {
	
	}
	
	public Flute(String name) {
		super(name);
	}
	
	@Override
	void play() {
		System.out.println("입으로 분다.");
	}
}

public class Java104_abstract {
	public static void main(String[] args) {
		Piano p = new Piano("Piano");
		System.out.println(p.name);
		p.play();
		
		Flute f = new Flute("Flute");
		System.out.println(f.name);
		f.play();
	}
}
