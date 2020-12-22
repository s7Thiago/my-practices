
import java.io.*;																											

class mFile{
	
	public String read(File file) throws IOException{
		
		String linha = "";
		StringBuilder content = new StringBuilder();
		FileReader fr = new FileReader(file);
		BufferedReader bfReader = new BufferedReader(fr);
		
		while((linha = bfReader.readLine()) != null) {
			content.append("\n" + linha);
		}
		
		return (content.toString());
	}
	
	public File create(String name, String path) throws IOException {
		File mPath = new File(path);
		File file = new File(path, name + ".txt");
		
		if(!mPath.exists()) {
			mPath.mkdirs();
		}else {
			System.out.println("O caminho \"" + path + "\" já existe!");
		}
		
		if(!file.exists()) {
			file.createNewFile();
		}else {
			System.out.println("O arquivo " + name + ".txt já existe em \"" + path + "\"");
		}
		
		return file;
	}
	
	public File write(File file, String content) throws IOException {
		FileWriter fw = new FileWriter(file, true);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.print(new StringBuilder().append(content));
		
		pw.flush();
		fw.flush();
		
		return file;
	}
}
