package objects;

import java.util.HashMap;
import java.util.Map;

public class User {

	private String name;
	private String lastName;
	private UserSecurityData autenticationData;
	private Map<String, UserSave> savesList = new HashMap<String, UserSave>();

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
	
	public void addNewUserSaveToList(String saveName, String saveContent) {
		UserSave userSave = new UserSave(saveName, saveContent);
		
		savesList.put(saveName, userSave);
	}

}
