package project.Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

import project.reserve_gui.DatePicker;
import project.Dao.Reservation_DAO;
import project.Dto.Reservation_DTO;
import project.reserve_gui.RequestData;

public class Reservation_model {
	String[] selectTime = new String[] { "09:00~09:30", "09:30~10:00", "10:00~10:30", "10:30~11:30", "11:00~11:30",
			"11:30~12:00", "13:00~13:30", "13:30~14:00", "14:00~14:30", "14:30~15:00", "15:00~15:30", "15:30~16:00",
			"16:00~16:30", "16:30~17:30", "17:00~17:30", "17:30~18:00" };
	List<String> impossibleTime;
	List<String> impossibleTimeClone;

	static Reservation_model rm = new Reservation_model();

	public static Reservation_model getInstance() {
		return rm;
	}

	// 받아온 리스트에서 병원명 추출 메소드
	public List<String> getHos_name(List<RequestData> reqData) {
		List<String> reqHosName = new ArrayList<>();
		reqHosName.add("병원을 선택하세요.");

		for (RequestData hos : reqData) {
			reqHosName.add(hos.getHosName());
		}

		LinkedHashSet<String> reqHosNameSet = new LinkedHashSet<>(reqHosName);
		reqHosName = new ArrayList<>(reqHosNameSet);

		return reqHosName;
	}

	// 받아온 리스트에서 소속병원에 해당하는 의사명 추출 메소드
	public List<String> getDoc_name(List<RequestData> reqData, String selectHos) {
		List<String> reqDocName = new ArrayList<>();

		for (RequestData doc : reqData) {
			if (doc.getHosName().equals(selectHos)) {
				reqDocName.add(doc.getDocName());
			}
		}

		HashSet<String> reqDocNameSet = new HashSet<>(reqDocName);
		reqDocName = new ArrayList<>(reqDocNameSet);

		return reqDocName;
	}

	// 병원명,의사명,날짜로 해당의사의 예약가능시간 조회
	public String[] getPossibleTime(String hosName, String drName, String date, int chk) {
		impossibleTime = Reservation_DAO.getInstance().getReserveTime(hosName, drName, date);

		String[] tempArray = new String[selectTime.length];
		System.arraycopy(selectTime, 0, tempArray, 0, selectTime.length);
		List<String> possibleTime = new ArrayList<>(Arrays.asList(tempArray));
		
		if (chk == 2) {
			DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss" , Locale.KOREA);
			String currentTime = timeFormat.format(new Date());
			impossibleTimeClone = new ArrayList<>();

			for (int i = 0; i < possibleTime.size(); i++) {			
				if (currentTime.compareTo(possibleTime.get(i).substring(0, 5)) >= 0) {
					impossibleTimeClone.add(possibleTime.get(i));
				}
			}
			
			for(int i = 0; i < impossibleTimeClone.size(); i++) {
				possibleTime.remove(impossibleTimeClone.get(i));
			}
		}

		for (int i = 0; i < impossibleTime.size(); i++) {
			if (possibleTime.contains(impossibleTime.get(i))) {
				possibleTime.remove(impossibleTime.get(i));
			}
		}

		return possibleTime.toArray(new String[possibleTime.size()]);
	}

	// insertMethod에 넘겨줄 dto구성
	public Reservation_DTO getReservation_DTO(String id, String name, String deptname, String docname, String symptom,
			String date, String time) {
		Reservation_DTO dto = new Reservation_DTO();

		dto.setReserv_id(id);
		dto.setReserv_num((int) ((Math.random() * 899999) + 100000));
		dto.setHos_name(name);
		dto.setReserv_deptname(deptname);
		dto.setDocname(docname);
		dto.setCurrent_symptom(symptom);
		dto.setReserv_date(date);
		dto.setReserv_time(time);

		return dto;
	}
}
