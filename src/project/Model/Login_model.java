package project.Model;

import java.util.Date;
import java.util.List;

import javax.swing.plaf.synth.SynthSpinnerUI;

import project.Dao.Department_DAO;
import project.Dao.FirstAid_DAO;
import project.Dao.Medicine_DAO;
import project.Dao.Patientinfo_DAO;
import project.Dao.Reservation_DAO;
import project.Dto.Department_DTO;
import project.Dto.FirstAid_DTO;
import project.Dto.Medicine_DTO;
import project.Dto.Patientinfo_DTO;
import project.Dto.Reservation_DTO;

public class Login_model {

	static Login_model  lm = new Login_model();
	public static Login_model getInstance() {
		 return lm;
	 }
	
	//로그인 아이디 비밀번호 확인.
	public int loginCheck(String id,String pass)
	{
		 int chk=0;
		
		 Patientinfo_DTO dto = Patientinfo_DAO.getInstance().checkId(id);
         if(dto.getPassword()==null){chk=2;}
		 else if(pass.equals(dto.getPassword())){chk=1;}
		 else {chk=3;}
			 
		return chk;
	}
	
	//아이디찾기
	public String idCheck(String name,String phone)
	{
		System.out.println(name+" "+phone);
		Patientinfo_DTO dto = Patientinfo_DAO.getInstance().searchId(name);
	   
		if(phone.equals(dto.getPhone())) {
			return dto.getId();
		}else {
			return null;
		}
			
		
		
	}
}
