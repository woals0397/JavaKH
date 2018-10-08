package java0928_binding;

public class Java112_binding {
	// 결합도가(의존도가) 낮아졌다.
	public static void process(HomeTv tv) {
		tv.turnOn();
		if(tv instanceof LgTv2) {
			LgTv2 lg = (LgTv2)tv;
			lg.call();
		}else if(tv instanceof SamsungTv2) {
			SamsungTv2 ss = (SamsungTv2)tv;
			ss.loc();
		}
	}
	
	public static void main(String[] args) {
		LgTv2 lg = new LgTv2("LG");
		process(lg);
		
		SamsungTv2 ss = new SamsungTv2("SAMSUNG");
		process(ss);
	}
}
