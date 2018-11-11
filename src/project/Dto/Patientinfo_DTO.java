package project.Dto;

import java.util.Date;

public class Patientinfo_DTO {

     String id;        // 아이디 
     String password;  // 비번
     String name;      // 성명
     String birth;       // 생일
     String address;    // 주소
     String phone;        // 전화번호
     String gender;    // 성별
     String question;  // 비밀번호 질문
     String answer;    //답변
     
     public Patientinfo_DTO() {
 		// TODO Auto-generated constructor stub
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

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
      
     
   
     
}
