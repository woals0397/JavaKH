package java0928_binding;

public class Java111_binding {
	
	public static void display(double x, double y) {
		System.out.println(x+y);
	}
	
	// 결합도가(의존성이) 높다 - 유지보수와 확장성이 약하다.
	public static void processLg(LgTv lg) {
		lg.turnOn();
	}
	
	public static void processSamsung(SamsungTv ss) {
		ss.turnOn();
	}
	
	public static void main(String[] args) {	
		display(4.5, 6.3);
		display(10, 20);
		LgTv lg = new LgTv("LG");
		processLg(lg);
		
		SamsungTv ss = new SamsungTv("SAMSUNG");
		processSamsung(ss);
	}
}
