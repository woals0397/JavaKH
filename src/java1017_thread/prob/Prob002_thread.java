package java1017_thread.prob;

class KoreanThread extends Thread{
	char[] kor = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
	
	@Override
	synchronized public void run() {
		for(int i = 0; i < kor.length; i++)
			System.out.print(kor[i]);
		System.out.println();
	}
}

class EnglishLowerThread extends Thread{
	char[] engL= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	@Override
	synchronized public void run() {
		for(int i = 0; i < engL.length; i++)
			System.out.print(engL[i]);
		System.out.println();
	}
}

class EnglishUpperThread extends Thread{
	char[] engU = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
	
	@Override
	synchronized public void run() {
		for(int i = 0; i < engU.length; i++)
			System.out.print(engU[i]);
		System.out.println();
	}
}

public class Prob002_thread {

	public static void main(String[] args) {
		EnglishLowerThread t1 = new EnglishLowerThread();
		EnglishUpperThread t2 = new EnglishUpperThread();
		KoreanThread t3 = new KoreanThread();
		
		t1.start();
		t2.start();
		t3.start();

	}//end main()

}//end class
