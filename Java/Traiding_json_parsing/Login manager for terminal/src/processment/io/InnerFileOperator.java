package processment.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InnerFileOperator {

	private static final String DEFAULT_PATH = "generated\\"; 
	private File fileReference;
	private String absolutePath;

	//Constructors, getters and setters
	public String getDefaultPath() {
		return DEFAULT_PATH;
	}
	
	public File getFileReference() {
		return fileReference;
	}

	public void setFileReference(File fileReference) {
		this.fileReference = fileReference;
	}

	public String getAbsolutePath() {
		return absolutePath;
	}

	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}
	//End of constructors, getters and setters

	public void createNewFile(String fileName) throws IOException {
		File defaultPath = new File(getAbsolutePath());
		fileReference = new File(defaultPath, fileName + ".json");
		
		//If the default path does not exists
		if(!(defaultPath.isDirectory() && defaultPath.exists())) {
			defaultPath.mkdirs();
		}
		
		//If the file does not exists
		if(!fileReference.exists()) {
			System.out.println("The file with name " + fileName + " does not exists in disk. Creating...");
			fileReference.createNewFile();
			setAbsolutePath(this.fileReference.getAbsolutePath());
		} else {
			System.out.println("An file called " + "\"" + fileName + ".json\"" + " already exists!");
		}
	}
	
	//Deletes an file of disk
	public void delete(){
		
	}
	
	//Writing in an file
	public void writeInFile(String filePathReference, String content) throws FileNotFoundException, IOException{
		File file = new File(filePathReference);
		
//		if(!file.exists()) {
			FileWriter fw = new FileWriter(file, false);
			PrintWriter pw = new PrintWriter(fw);
			
			//Write it
			pw.print(content);
			
			//Close te flow
			fw.flush();
			fw.close();
			pw.flush();
			pw.close();
		/*}else {
			System.out.println("Um arquivo com as mesmas características já existe no mesmo endereço\n\n");
		}*/
		
	}
}
