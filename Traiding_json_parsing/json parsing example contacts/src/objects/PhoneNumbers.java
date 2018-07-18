package objects;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumbers {

	private List<PhoneNumber> phoneNumbersList = new ArrayList<PhoneNumber>();

	public PhoneNumbers(List<PhoneNumber> phoneNumbersList) {
		this.phoneNumbersList = phoneNumbersList;
	}
	
	public PhoneNumbers() {
		// TODO Auto-generated constructor stub
	}

	public void add(PhoneNumber phoneNumber) {
		phoneNumbersList.add(phoneNumber);
	}

	@SuppressWarnings("unused")
	private void remove(int position) {
		phoneNumbersList.remove(position);
	}

	public List<PhoneNumber> get() {
		return this.phoneNumbersList;
	}
}