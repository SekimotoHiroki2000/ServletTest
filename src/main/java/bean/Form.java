package bean;

public class Form implements java.io.Serializable{
	private String name;
	private String campany;
	private String mail;
	private String inquiry;
	private String merumaga;
	
	public String getName() {
		return name;
	}
	public String getCampany() {
		return campany;
	}
	public String getMail() {
		return mail;
	}
	public String getInquiry() {
		return inquiry;
	}
	
	public String getMerumaga() {
		
		return merumaga;
	}
	
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setCampany(String campany) {
		this.campany = campany;
	}
	public void setMail(String name) {
		this.name = name;
	}
	public void setInquiry(String inquiry) {
		this.inquiry = inquiry;
	}
	
	//未実装メルマガ
	public void setMerumaga(String[] merumagas) {
		String merumaga = "";
		for(String meru : merumagas) {
			merumaga = merumaga + meru + " ";
		}
		if(merumaga.equals("")) {
			this.merumaga = "メルマガの希望はありません";
		}else {
	    this.merumaga = merumaga;
		}
		
		this.merumaga = merumaga;
	}
	
	
	
}

	
