
public class TuzelMusteri extends Customer {

	public String vergiNo;
	public String unvan;
	
	public TuzelMusteri() {
		super();
	}

	public TuzelMusteri(String vergiNo, String unvan) {
		super();
		this.vergiNo = vergiNo;
		this.unvan = unvan;
	}

	public String getVergiNo() {
		return vergiNo;
	}

	public void setVergiNo(String vergiNo) {
		this.vergiNo = vergiNo;
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}
}
