package objects;

public class PhoneNumber {

	private String type;
	private String number;
	
	public PhoneNumber(String type, String number) {
		super();
		this.type = type;
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n|Type: " + this.getType()
			 + "\n|Number: " + this.getNumber();
	}
}