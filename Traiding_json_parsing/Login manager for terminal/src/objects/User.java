package objects;

import java.util.HashMap;
import java.util.Map;

public class User {

	private String name;
	private String lastName;
	private UserSecurityData autenticationData;
	private Map<String, UserSave> savesList = new HashMap<String, UserSave>();

	//Constructors, getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserSecurityData getAutenticationData() {
		return autenticationData;
	}

	public void setAutenticationData(UserSecurityData autenticationData) {
		this.autenticationData = autenticationData;
	}

	public Map<String, UserSave> getSavesList() {
		return savesList;
	}

	public void setSavesList(Map<String, UserSave> savesList) {
		this.savesList = savesList;
	}
	//End of constructors, getters and setters
	
	//Will be used for add each user's record, and cause these records
	//are linked to their respective user objects  
	public void addNewUserSaveToList(String saveName, String saveContent) {
		UserSave userSave = new UserSave(saveName, saveContent);
		
		savesList.put(saveName, userSave);
	}

}
