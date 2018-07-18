package objects;

import java.util.List;

public class Contact {

	private String firstName;
	private String lastName;
	private int age;
	private Address address;
	List<PhoneNumber> phoneNumberList;

	public Contact(String firstName, String lastName, int age, Address address, List<PhoneNumber> phoneNumberList) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		this.phoneNumberList = phoneNumberList;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<PhoneNumber> getPhoneNumberList() {
		return phoneNumberList;
	}

	public void setPhoneNumbersList(List<PhoneNumber> phoneNumber) {
		this.phoneNumberList = phoneNumber;
	}
	
	public String listPhoneNumbers(List<PhoneNumber> phoneNumberList) {
		StringBuilder listOfNumbers = new StringBuilder();
		for(PhoneNumber singleElement : phoneNumberList) {
			
			listOfNumbers.append(singleElement.toString() + "\n");
		}
		
		return listOfNumbers.toString();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + this.getFirstName() + " " + this.getLastName()
			  + "\nAge: " + this.getAge()
			  + "\n" + getAddress().toString()
			  + "\n" + listPhoneNumbers(getPhoneNumberList());
	}
}