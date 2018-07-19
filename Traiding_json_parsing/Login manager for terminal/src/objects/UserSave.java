package objects;

public class UserSave {

	private String saveKey;
	private String saveContent;

	//Constructors, getters and setters
	public UserSave(String saveKey, String saveContent) {
		super();
		setSaveKey(saveKey);
		setSaveContent(saveContent);
	}

	public String getSaveKey() {
		return saveKey;
	}

	public void setSaveKey(String saveKey) {
		this.saveKey = saveKey;
	}

	public String getSaveContent() {
		return saveContent;
	}

	public void setSaveContent(String saveContent) {
		this.saveContent = saveContent;
	}
	//End of constructors, getters and setters

}
