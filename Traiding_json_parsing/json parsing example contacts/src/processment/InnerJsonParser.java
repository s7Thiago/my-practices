package processment;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import objects.Address;
import objects.Contact;
import objects.PhoneNumber;
import objects.PhoneNumbers;

public class InnerJsonParser {
	
	private List<Contact> contactsList = new ArrayList<Contact>();
	private String stringJson;
	
	public List<Contact> getContactsFromJson() {
		List<Contact> innerContactsList = this.getContactsList();
		
		//Grouping objects who will receive the datas
		Contact contact;
		Address address;
		PhoneNumbers phoneNumbers;
		PhoneNumber phoneNumberObject;
		
		//Grouping data to set in objects
		String firstName, lastName, PhonenumberType, streetAddress, city, state, phoneNumber;
		int age, postalCode;
		JsonObject addressObject;
		JsonArray phoneNumberFromJson;
		
		
		//Will be used for provide acess to json inner structure
		JsonParser parser = new JsonParser();
		JsonObject contactJsonObject;
		
		//Link to this variable to contacts colection in json file
		JsonArray rootArray = parser.parse(getStringJson()).getAsJsonArray();
		
		//Walks the rootArray to get single json objects
		for(JsonElement element : rootArray) {
			//getting the single object to extract data
			contactJsonObject = element.getAsJsonObject();
			
			//getting the datas
			firstName = contactJsonObject.get("firstName").getAsString();
			lastName = contactJsonObject.get("lastName").getAsString();
			age = contactJsonObject.get("age").getAsInt();
			
			//getting the adress datas
			addressObject = contactJsonObject.get("address").getAsJsonObject();
			streetAddress = addressObject.get("streetAddress").getAsString();
			city = addressObject.get("city").getAsString();
			state = addressObject.get("state").getAsString();
			postalCode = addressObject.get("postalCode").getAsInt();
			
			//getting the phone numbers
			phoneNumberFromJson = contactJsonObject.get("phoneNumbers").getAsJsonArray();
			phoneNumbers = new PhoneNumbers();
			
			for(JsonElement phoneContactElement : phoneNumberFromJson) {
				
				//getting the phone details
				phoneNumber = phoneContactElement.getAsJsonObject().get("number").getAsString();
				PhonenumberType = phoneContactElement.getAsJsonObject().get("type").getAsString();
				
				//Setting the phone details in a object
				phoneNumberObject = new PhoneNumber(PhonenumberType, phoneNumber);
				
				//Adding the phone number to list
				phoneNumbers.add(phoneNumberObject);
			}
			
			address = new Address(streetAddress, city, state, postalCode);
			contact = new Contact(firstName, lastName, age, address, phoneNumbers.get());
			
			innerContactsList.add(contact);
			
		}
		
		return innerContactsList;
	}

	public InnerJsonParser(String stringJson) {
		super();
		setStringJson(stringJson);
	}

	public String getStringJson() {
		return stringJson;
	}

	public void setStringJson(String stringJson) {
		this.stringJson = stringJson;
	}

	public List<Contact> getContactsList() {
		return contactsList;
	}

	public void setContactsList(List<Contact> contactsList) {
		this.contactsList = contactsList;
	}
	
	
}