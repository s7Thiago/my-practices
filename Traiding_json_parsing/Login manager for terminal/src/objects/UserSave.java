package objects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UserSave {

	private String saveKey;
	private String saveContent;
	private String absolutePath;
	private File fileReference;

	//Constructors, getters and setters
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
	
	public String getAbsolutePath() {
		return absolutePath;
	}

	private void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}
	
	//End of constructors, getters and setters

	//Operations of this class
	
	//Create a save in the project root
	public void create() throws IOException {
		File defaultPath = new File("resources\\");
		fileReference = new File(defaultPath, getSaveKey() + ".json");
		
		//If the default path does not exists
		if(!(defaultPath.isDirectory() && defaultPath.exists())) {
			defaultPath.mkdirs();
		}
		
		//If the file does not exists
		if(!fileReference.exists()) {
			System.out.println("The file with name " + getSaveKey() + " does not exists in disk. Creating...");
			fileReference.createNewFile();
			setAbsolutePath(this.fileReference.getAbsolutePath());
		} else {
			System.out.println("An file called " + "\"" + getSaveKey() + ".json\"" + " already exists!");
		}
	}
	
	public void delete(String absolutePath) {
		
	}
	
	private void write(String filePathReference, String saveContent) throws IOException {
		File file = new File(filePathReference);
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.print(saveContent);
		
		fw.flush();
		fw.close();
		pw.flush();
		pw.close();
	}

}



























