public class UserInfo {
	String firstName;
	String lastName;
	long zip;
	
	public void setUserInfo(String firstName, String lastName, long zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.zip = zip;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public long getZip() {
		return this.zip;
	}
}
