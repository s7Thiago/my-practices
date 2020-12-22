package processment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InnerFileOperator {
	private String defaultFilePath;

	@SuppressWarnings("resource")
	public String read() throws IOException {
		String line = null;
		StringBuilder content = new StringBuilder();

		File file = new File(getDefaultFilePath());

		// It will be used for provide util file tools
		FileReader fr = new FileReader(file);
		BufferedReader bfReader = new BufferedReader(fr);

		// Read it
		while ((line = bfReader.readLine()) != null) {
			content.append(line + "\n");
		}
		return content.toString();
	}

	@SuppressWarnings("resource")
	public String read(String filePath) throws IOException {
		String line = null;
		StringBuilder content = new StringBuilder();

		setDefaultFilePath(filePath);

		File file = new File(getDefaultFilePath());

		// It will be used for provide util file tools
		FileReader fr = new FileReader(file);
		BufferedReader bfReader = new BufferedReader(fr);

		// Read it
		while ((line = bfReader.readLine()) != null) {
			content.append(line + "\n");
		}
		return content.toString();
	}

	public InnerFileOperator(String defaultFilePath) {
		setDefaultFilePath(defaultFilePath);
	}

	public InnerFileOperator() {
	}

	public String getDefaultFilePath() {
		return defaultFilePath;
	}

	public void setDefaultFilePath(String defaultFilePath) {
		this.defaultFilePath = defaultFilePath;
	}

}