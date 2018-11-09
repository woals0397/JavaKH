package project;

public class ReservationDTO {
	private String reserv_id;
	private int reserv_num;
	private String hos_name;
	private String reserv_deptname;
	private String docName;
	private String current_sysptom;
	private String reserv_date;
	private String reserv_time;
	
	public ReservationDTO() {
	
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

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getCurrent_sysptom() {
		return current_sysptom;
	}

	public void setCurrent_sysptom(String current_sysptom) {
		this.current_sysptom = current_sysptom;
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
