package java0919_class;

class Song{
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	
	public Song() {
		
	}
	
	public Song(String title, String artist, String album, String[] composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	
	public void show() {
		System.out.printf("노래 제목:%s\n", this.title);
		System.out.printf("가수:%s\n", this.artist);
		System.out.printf("앨범:%s\n", this.album);
		System.out.printf("작곡가:");
		for(int i = 0; i < this.composer.length; i++) {
			char chk = i < this.composer.length-1 ? ',' : '\n';
			System.out.printf("%s%c", this.composer[i], chk);
			/*
			if(i != this.composer.length-1)
				System.out.print(this.composer[i]+",");
			else
				System.out.println(this.composer[i]);
			*/
		}
		System.out.printf("년도:%d\n", this.year);
		System.out.printf("트랙 번호:%d\n", this.track);
	}
}

public class Java073_class {
	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", "Arrival", new String[] {"Benny Andersson", "Bjorn Ulvaeus"}, 1977, 2);
		s.show();
	}
}
