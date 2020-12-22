package objects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class User {

	private String name;
	private String lastName;
	private UserSecurityData autenticationData;
	private List<UserSave> savesList = new ArrayList<UserSave>();

	// Constructors, getters and setters
	public User(String name, String lastName, UserSecurityData autenticationData) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.autenticationData = autenticationData;
	}
	
	public User(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	public User() {
		super();
	}

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

	public List<UserSave> getSavesList() {
		return savesList;
	}

	public void setSavesList(List<UserSave> savesList) {
		this.savesList = savesList;
	}
	// End of constructors, getters and setters

	// Will be used for add each user's record, and cause these records
	// are linked to their respective user objects
	public void addNewUserSaveToList(String saveName, String saveContent) throws IOException {

		saveName = String.valueOf(User.this.hashCode()) + " - " + saveName;

		savesList.add(new UserSave(saveName, saveContent));
	}

	// Operations for user's saves
	public void removeUserSave(String saveKey) {
		savesList.remove(saveKey);
	}
}
