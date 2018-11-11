package project.Dto;

import java.util.Date;

public class Reservation_DTO {

	 String reserv_id;       //회원아이디
	 int reserv_num;         //진료번호
	 String hos_name;        //병원이름
	 String reserv_deptname; //진료과목
	 String docname;         //의사이름
	 String current_symptom; //증상
	 String reserv_date;     //진료날짜
	 String reserv_time;	 //진료시간
	 
	 public Reservation_DTO() {
		// TODO Auto-generated constructor stub
	}

	public String getReserv_id() {
		return reserv_id;
	}

	public void setReserv_id(String reserv_id) {
		this.reserv_id = reserv_id;
	}

	public int getReserv_num() {
		return reserv_num;
	}

	public void setReserv_num(int reserv_num) {
		this.reserv_num = reserv_num;
	}

	public String getHos_name() {
		return hos_name;
	}

	public void setHos_name(String hos_name) {
		this.hos_name = hos_name;
	}

	public String getReserv_deptname() {
		return reserv_deptname;
	}

	public void setReserv_deptname(String reserv_deptname) {
		this.reserv_deptname = reserv_deptname;
	}

	public String getDocname() {
		return docname;
	}

	public void setDocname(String docname) {
		this.docname = docname;
	}

	public String getCurrent_symptom() {
		return current_symptom;
	}

	public void setCurrent_symptom(String current_symptom) {
		this.current_symptom = current_symptom;
	}

	public String getReserv_date() {
		return reserv_date;
	}

	public void setReserv_date(String reserv_date) {
		this.reserv_date = reserv_date;
	}

	public String getReserv_time() {
		return reserv_time;
	}

	public void setReserv_time(String reserv_time) {
		this.reserv_time = reserv_time;
	}
	 
}
