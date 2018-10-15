package exam;

class User extends Object implements Cloneable{
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	private String phone;
	
	public User() {
		
	}
	
	public User(String id, String password, String name, int age, char gender, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
		
	@Override
	public String toString() {
		return id + " " + password + " " + name + " " + age + " " + gender + " " + phone;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

public class ex8 {
	public static void main(String[] args) {
		User[] users = new User[3];
		
		users[0] = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		users[1] = new User("user02", "pass02", "이영희", 25, 'F', "010-5555-7777");
		users[2] = new User("user03", "pass03", "황진이", 20, 'F', "010-9874-5632");
		
		System.out.println("users list------------------------------------------");
		for(int i = 0; i < users.length; i++)
			System.out.println(users[i].toString());
		
		User[] copyUsers = new User[users.length];
		for(int i = 0; i < copyUsers.length; i++)
			try {
				copyUsers[i] = (User)users[i].clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		
		System.out.println("CopyUsers list---------------------------------------");
		for(User u : copyUsers)
			System.out.println(u.toString());
		
		System.out.println("비교결과-----------------------------------------------");
		for(int i = 0; i < users.length; i++)
			System.out.println(users[i].equals(copyUsers[i]));
	}
}
