package addressBook;

public class Address {
	private int StreetNumber;
	private String roadName = "a";
	private int zipCode;
	public int getStreetNumber() {
		return StreetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.StreetNumber = streetNumber;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public Address(int StreetNumber, String roadName, int zipCode){
		this.StreetNumber = StreetNumber;
		this.roadName = roadName;
		this.zipCode = zipCode;
	}
}
