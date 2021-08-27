
public class GercekMusteri extends Customer {

	public String firstName;
	public String lastName;
	public String tcNo;
	
	public GercekMusteri() {
		super();
	}

	public GercekMusteri(String firstName, String lastName, String tcNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.tcNo = tcNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
}
