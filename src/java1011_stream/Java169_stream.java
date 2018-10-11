package java1011_stream;

import java.io.File;

public class Java169_stream {
	public static void main(String[] args) {
		File file = new File("src/java1011_stream/temp");
		if(!file.isDirectory()) {
			// temp폴더 생성
			file.mkdirs();
		}
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		file = new File("src/java1011_stream/song.txt");
		System.out.println(file.exists());
		
		file = new File("src/java1011_stream");
		String[] list = file.list();	// 현재 위치에 있는 모든 파일과 폴더명을 String배열로 리턴한다.
		for(String sn : list)
			System.out.println(sn);
		
		System.out.println("//////////////////////");
		
		File[] listFile = file.listFiles();	// 현재 위치에 있는 파일을 File배열로 리턴한다.
		for(File fe : listFile) {
			//if(fe.isFile())
				System.out.println(fe.getName());
		}
		
		file = new File("src/java1011_stream/source.txt");
		if(file.exists()) {
			// 파일 삭제
			file.delete();
			System.out.println(file.getName()+"파일 삭제");
		}else {
			System.out.println(file.getName()+"파일 없음");
		}
	}
}
