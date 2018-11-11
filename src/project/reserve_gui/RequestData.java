package project.reserve_gui;

public class RequestData {
	private String deptName;
	private String deptInfo;
	private String hosName;
	private String docName;
	
	public RequestData(String deptName, String deptInfo, String hosName, String docName) {
		this.deptName = deptName;
		this.deptInfo = deptInfo;
		this.hosName = hosName;
		this.docName = docName;
	}

	public String getDeptName() {
		return deptName;
	}

	public String getDeptInfo() {
		return deptInfo;
	}

	public String getHosName() {
		return hosName;
	}

	public String getDocName() {
		return docName;
	}
	
	
}
