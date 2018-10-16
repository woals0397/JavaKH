package java1016_collection;

import java.util.Comparator;

public class Person implements Comparator<Person>{
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 이름 오름차순, 나이 내림차순
	@Override
	public int compare(Person o1, Person o2) {
		// 이름 오름차순 o1.name.compareTo(o2.name)
		// 이름 내림차순 o2.name.compareTo(o1.name)
		// 나이 오름차순 > 1, < -1 == 0
		// 나이 내림차순 > -1, < 1 == 0
		
		/*
		if(!(o1.getName().equals(o2.getName()))) {
			return o1.getName().compareTo(o2.getName());
		}else if(o1.getAge() > o2.getAge()){
			return -1;
		}else if(o1.getAge() < o2.getAge()) {
			return 1;
		}else {
			return 0;
		}
		*/
		
		if(!(o1.getName().equals(o2.getName()))) {
			return o1.getName().compareTo(o2.getName());
		}else {
			return new Integer(o2.getAge()).compareTo(o1.getAge());
		}
		
	}
	
}
