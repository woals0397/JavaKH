package java1012_collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/* [프로그램 출력결과]
kim    56  78   12  146
hong   46  100  97  243
park   96  56   88  240
*/
/*
 * 1 입력스트림연결
 * 2 한줄 읽어오고
 * 3 sawon멤버변수
 * 4 vector 추가
 * 5 234 반복
 * 6 vector 리턴
 */
public class Java181_Vector {

	public static void main(String[] args) {
		String sn = "./src/java1012_collection/score.txt";
		Vector<Sawon> vt = lines(sn);
		prnDisplay(vt);
	}// end main()
	
	private static Vector<Sawon> lines(String strName) {
		// strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한후
		// 리턴하는 프로그램을 구현하시오.
		Vector<Sawon> v = new Vector<Sawon>();
		File file = new File(strName);
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				String stn = sc.nextLine();
				String[] data = stn.split("[:/]");
				Sawon sn = new Sawon(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]),
						Integer.parseInt(data[3]));
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} finally {
			sc.close();
		}

		/*
		 * FileReader fr=null; BufferedReader br = null; try { fr=new FileReader(file);
		 * br=new BufferedReader(fr); String line=""; while((line=br.readLine()) !=
		 * null) { String[] arr=line.split(":"); String[] arr2=arr[1].split("/");
		 * v.add(new
		 * Sawon(arr[0],Integer.parseInt(arr2[0]),Integer.parseInt(arr2[1]),Integer.
		 * parseInt(arr2[2]))); } } catch (FileNotFoundException e) {
		 * e.printStackTrace(); } catch (IOException e) { e.printStackTrace(); }
		 */

		return v;
	}// end lines()

	private static void prnDisplay(Vector<Sawon> vt) {
		// vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하시오.
		for (Sawon pn : vt)
			System.out.println(pn.toString());

	}// end prnDisplay()

}// end class
