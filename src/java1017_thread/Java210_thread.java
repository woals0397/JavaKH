package java1017_thread;

/*
 * 동기화(synchronized)
 * 
 * 계좌번호 => 공유자원
 * A지점, B지점, C지점  => 스레드
 * 
 * 동기화 : 하나의 스레드가 공유자원을 사용하고 있으면 다른 스레드가 
 *     접근하는 것을 막아주는 기능이다.
 *     
 * 동기화 목적 : 데이터의 일관성 유지를 위해서이다.
 * 동기화 키워드 : synchronized
 * 
 * 동기화 설정방법
 * 1) 메소드에 lock을 걸고자 할때
 *    synchronized void openDoor(String name){}    
 * 2) 특정한 객체에 lock을 걸고자 할때
 *    void openDoor(String name){
 *       synchronized(객체의 참조변수){
 *       
 *       }
 *    }
 *
 * wait(), notify(), notifyAll()메소드 동기화가
 *   설정되여 있는 영역에서만 호출 할 수 있다.       
 */

// 공유자원
class Washroom{
	synchronized void openDoor(String name) {
		System.out.println(name + "님이 입장");
		for(int i = 0; i < 50000; i++) {
			if(i%10000 == 0) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name + "님이 업무 보는중");
			}
		}
		System.out.println(name + "님이 퇴장");
	}
}

class FamilyThread extends Thread{
	private Washroom wr;
	private String who;
	
	public FamilyThread() {
	
	}
	
	public FamilyThread(Washroom wr, String who) {
		this.wr = wr;
		this.who = who;
	}
	
	@Override
	public void run() {
		wr.openDoor(who);
	}
}

public class Java210_thread {
	public static void main(String[] args) {
		Washroom wr = new Washroom();
		
		FamilyThread father = new FamilyThread(wr, "father");
		FamilyThread mother = new FamilyThread(wr, "mother");
		FamilyThread sister = new FamilyThread(wr, "sister");
		FamilyThread brother = new FamilyThread(wr, "brother");
		father.start();
		mother.start();
		sister.start();
		brother.start();
	}
}
