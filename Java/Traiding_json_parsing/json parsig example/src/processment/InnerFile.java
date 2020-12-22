package processment;

import java.io.*;

public class InnerFile {

	// Realizes the read of files with path specified in the parameter
	public String read(String filepath) throws IOException {

		// Stores the content to be returned;
		StringBuilder content = new StringBuilder();
		String line = null;

		// Used for provide connection direct to physic file
		File file = new File(filepath);

		// Provides read resources to files
		FileReader fr = new FileReader(file);
		BufferedReader bfReader = new BufferedReader(fr);

		// Read it
		while ((line = bfReader.readLine()) != null) {
			content.append(line + "\n");
		}

		bfReader.close();
		return content.toString();
	}
}
