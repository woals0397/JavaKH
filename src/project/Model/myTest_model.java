package project.Model;

import java.util.List;

import project.Dao.Patientinfo_DAO;
import project.Dao.Reservation_DAO;
import project.Dao.ReserveComplete_DAO;
import project.Dto.Patientinfo_DTO;
import project.Dto.Reservation_DTO;
import project.Dto.ReserveComplete_DTO;
import project.login_gui.LoginTest;

public class myTest_model {

	
	
	static myTest_model  md = new myTest_model();
	public static myTest_model getInstance() {
		 return md;
	 }
	
	public Patientinfo_DTO searchPDTO(String id) {
		Patientinfo_DTO dto = Patientinfo_DAO.getInstance().searchAll(id);  
		
		return dto; 
	}
	public List<Reservation_DTO> searchRDTO(String id) {
		List<Reservation_DTO> list;
		list= Reservation_DAO.getInstance().searchAll(id);
		return list;
		
	}

	public void modifyDTO(String pass , String name , String phone , String birth , String adr) {
		Patientinfo_DTO dto = new Patientinfo_DTO();
		dto.setId(LoginTest.id);
		dto.setPassword(pass);
		dto.setName(name);
		dto.setPhone(phone);
		dto.setBirth(birth);
		dto.setAddress(adr);
		Patientinfo_DAO.getInstance().modifyMethod(dto);
	}
	public void deleteRDTO(String reserv_num , int num) {
		
		 Reservation_DAO.getInstance().deleteReserve(reserv_num,num);
		 
	}

	public List<ReserveComplete_DTO> searchRCDTO(String id) {
		List<ReserveComplete_DTO> list;
		list= ReserveComplete_DAO.getInstance().searchAll(id);
		return list;
	}
}
