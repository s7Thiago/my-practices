package processment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InnerFileOperator {
	
	private String defaultPath = null;
	
	//It will be used for creates an pre initialized object with a default path of works
	public InnerFileOperator(String path) {
		setDefaultPath(path);
	}
	
	public InnerFileOperator() {
		// TODO Auto-generated constructor stub
	}
	
	@SuppressWarnings({ "null", "resource" })
	public String read() throws IOException {
		
		//It will be used for return the string content of refered file
		StringBuilder content = new StringBuilder();
		String line = "";
		
		//It will be used for provide access to phisic file
		File file = new File(getDefaultPath());
		
		//It will be used for provide access to methods for read an file
		FileReader fr = new FileReader(file);
		BufferedReader bfReader = new BufferedReader(fr);
		
		//Read it
		while((line = bfReader.readLine()) != null) {
			content.append(line + "\n");
		}
		
		return content.toString();
	}

	public String getDefaultPath() {
		return defaultPath;
	}

	private void setDefaultPath(String defaultPath) {
		this.defaultPath = defaultPath;
	}

}
