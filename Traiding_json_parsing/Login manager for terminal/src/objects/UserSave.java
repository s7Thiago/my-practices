package objects;

import java.io.IOException;

import processment.io.InnerFileOperator;

public class UserSave extends InnerFileOperator {

	private String saveKey;
	private String saveContent;

	// Constructors, getters and setters
	public UserSave(String saveKey, String saveContent) throws IOException {
		super();
		setSaveKey(saveKey);
		setSaveContent(saveContent);
		create();
		write(this.getAbsolutePath(), saveContent);
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

	// End of constructors, getters and setters

	// Operations of this class

	// Create a save in the project root
	public void create() throws IOException {
		setAbsolutePath(this.getDefaultPath() + "saves\\");
		createNewFile(getSaveKey());
	}

	public void delete(String absolutePath) {

	}

	private void write(String filePathReference, String saveContent) throws IOException {
		
		//if(!(this.getFileReference().exists())) {
			writeInFile(filePathReference, saveContent);
		/*}else {
			System.out.println("Atenção -> Um arquivo com as mesmas características já existe!\n\n");
		}*/
		
	}

}
