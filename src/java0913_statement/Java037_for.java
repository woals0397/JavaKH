package java0913_statement;

/*
 * 반복문에서 특정 위치로 이동(continue)을 하거나 빠져나올때(break)
 * 반복문은 label을 선언하고 호출하면 된다.
 */

public class Java037_for {
	public static void main(String[] args) {
		move:
		for(int i = 0; i <= 3; i++) {
			for(int j = 0; j <= 2; j++) {
				System.out.printf("j=%d\n", i);
				//break move;
				continue move;
			}
		}
	}
}
