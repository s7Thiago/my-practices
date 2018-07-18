import java.io.IOException;
import java.util.List;

import objects.Contact;
import processment.InnerFileOperator;
import processment.InnerJsonParser;

public class Main {

	public static void main(String[] args) throws IOException {
		
		String filePath = "D:\\Git test Workspace\\my-practices\\Traiding_json_parsing\\contacts.json";
		List<Contact> contactsList = new InnerJsonParser(new InnerFileOperator(filePath).read()).getContactsFromJson();
		
		for(Contact contact : contactsList) {
			
		System.out.println(contact.toString() + "\n******************************************************");
		
		}
	}
}