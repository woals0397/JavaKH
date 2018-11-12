package project.Model;

import project.Dao.Patientinfo_DAO;
import project.Dto.Patientinfo_DTO;

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
		
		Patientinfo_DTO dto = Patientinfo_DAO.getInstance().searchId(name);
	   
		if(phone.equals(dto.getPhone())) {
			return dto.getId();
		}else {
			return null;
		}
	}//idCheck

	//비밀번호찾기 
	public String passCheck(String id,String que,String anwswer)
	{
		String pass = null;
		Patientinfo_DTO dto = Patientinfo_DAO.getInstance().checkId(id);
		if(dto.getId()==null) {
			pass = "해당아이디가 없습니다";
		}else if( que.equals(dto.getQuestion()) && anwswer.equals(dto.getAnswer()) ) {
			pass = "비밀번호는 "+dto.getPassword()+" 입니다";
			System.out.println("정보 모두 일치");
		}else if( !(dto.getQuestion().equals(que)) && dto.getAnswer().equals(anwswer) ) {
			pass = "질문이 맞지않습니다";
		}else if( dto.getQuestion().equals(que) && !(dto.getAnswer().equals(anwswer)) ) {
			pass = "답변이 맞지않습니다"; 			
		}else {
			pass = "질문이 맞지않습니다";
		}
			
		return pass;
	}
	
	public String validityCheck(Patientinfo_DTO pi) {
		
		
		String result=null;
		
		String id = pi.getId();
		System.out.println(id);
		String pass = pi.getPassword();
		System.out.println(pass);
		String name = pi.getName();
		System.out.println(name);
		String birth=pi.getBirth();
		String address = pi.getAddress();
	    String phone = pi.getPhone();
		String gender = pi.getGender();
		String ques = pi.getQuestion();
		String answer = pi.getAnswer();
		
		
		   //공백이 1개이상이거나              //길이가 6이상이 12이하가 아니거나          
		if(  (id.matches("\\s{1,}")) || !(id.matches("[\\w]{6,12}")) ||  !(id.matches("^[a-zA-Z]{1}[a-zA-Z0-9_]{4,11}$"))  ){
			return "아이디형식이잘못되었습니다";
		}else if(!pass.matches("([a-zA-Z0-9].*[!,@,#,$,%,^,&,*,?,_,~])|([!,@,#,$,%,^,&,*,?,_,~].*[a-zA-Z0-9])")){ 
			return "비밀번호는 영문,숫자,특수문자(!@$%^&* 만 허용)를 사용하여 6~16자까지 가능합니다";
		}else if(id.equals(pass)) {
			return "비밀번호는 아이디와같을수 없습니다";
		}	        //가~하 2,4 의 조건이거나        //  영문조건이거나                                                  //이름이 숫자면
		else if( !(name.matches("[가-힣]{2,4}") || name.matches("[a-zA-Z]{2,10}") ||  !(name.matches(".*[0-9].*"))) ) {
       	    return "이름이 될수없습니다";
        }else if(id==null || pass==null || name==null || birth==null || address==null || phone==null || gender==null || ques==null || answer==null) {
        	return "입력되지않은 정보가있습니다";
        }
		return result;
		
		
    }
	
	
	
	
}
