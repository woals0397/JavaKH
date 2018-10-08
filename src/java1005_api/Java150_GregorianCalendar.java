package java1005_api;

import java.util.GregorianCalendar;

abstract class Pet{
	public abstract void move();
	
	public static Pet getInstance() {
		return new Dog();
	}
}

class Dog extends Pet{
	public void move() {
		System.out.println("애완동물이 움직인다.");
	}
	
	public void process() {
		System.out.println("process");
	}
}

public class Java150_GregorianCalendar {
	public static void main(String[] args) {
		/*
		Pet pet = Pet.getInstance();
		pet.move();
		//pet.process();
		*/
		
		int year = 2016;
		GregorianCalendar gre = new GregorianCalendar();
		if(gre.isLeapYear(year))
			System.out.printf("%d 년도는 윤년입니다.\n", year);
		else
			System.out.printf("%d 년도는 평년입니다.\n", year);
	}
}
