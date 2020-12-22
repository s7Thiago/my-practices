package jsonGeneratingExample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InnerFile {
	private String fileName;
	private static final String DEFAULT_PATH = "generated\\";
	
	InnerFile(String fileName) throws IOException {
		super();
		setFileName(fileName);
		create();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String filePath) {
		this.fileName = filePath;
	}

	public static String getDefaultPath() {
		return DEFAULT_PATH;
	}

	public void create() throws IOException {
		
		File path = new File(getDefaultPath());
		File file = new File(path, getFileName() + ".json");
		
		if(!(path.exists())) {
			path.mkdirs();
		}
		
		if (!(file.exists())) {
			file.createNewFile();
		} else {
			System.out.println("Este arquivo está em conflito com " + file.getAbsolutePath());
		}
	}

	public void write(String content) throws IOException {
		File file = new File(getDefaultPath() + getFileName() + ".json");
		
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);
		
		//Ecrevendo
		pw.print(content);
		
		//Fechando o fluxo
		pw.flush();
		pw.close();
	}

	public String read() throws IOException {
		String line;
		StringBuilder content = new StringBuilder();

		//
		BufferedReader bfReader = new BufferedReader(new FileReader(new File(getDefaultPath() + getFileName())));

		while ((line = bfReader.readLine()) != null) {
			content.append(line + "\n");
			System.out.println(line);
		}

		return content.toString();
	}

}