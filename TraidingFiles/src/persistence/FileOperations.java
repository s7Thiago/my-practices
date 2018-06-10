package persistence;																																										
import java.io.*;

public class FileOperations {
	
	//Cria um novo arquivo no caminho passado em parâmetro
	public File createNewFile(String path, String fileName) throws IOException {
		File mPath = new File(path);
		File file = new File(mPath, fileName);
		
		//Verificando se o caminho especificado existe
		if(!mPath.exists()) {
			System.out.println("O caminho " + mPath.toString() + " não existe ainda. Criando...");
			mPath.mkdirs();
		}else{
			System.out.println("O caminho " + mPath.toString() + " já existe.");
		}
		
		//Verificando se o arquivo existe existe
		if(!file.exists()) {
			System.out.println("O arquivo " + file.getName() + " não existe ainda. Criando...");
			file.createNewFile();
			
		}else{
			System.out.println("O arquivo " + file.getName() + " já existe.");
		}
		
		return file;
	}
	
	//Escreve em um arquivo especificado em parâmetro
	public File writeImFile(File target, String content, boolean overWrite) throws IOException {
		FileWriter fw = new FileWriter(target, overWrite);
		PrintWriter pw = new PrintWriter(fw);
		
		//Escrevendo no arquivo
		pw.print(content);
		
		//Fechando o fluxo para liberar o arquivo
		fw.flush();
		pw.flush();
		
		return target;
	}
	
	//Lê um arquivo especificado em parâmetro
	public String readThisFile(File target) throws FileNotFoundException, IOException {
		
		String line = "", content = "";
		FileReader fr = new FileReader(target);
		BufferedReader bfReader = new BufferedReader(fr);
		StringBuilder mStringBuilder = new StringBuilder();
		
		while((line = bfReader.readLine()) != null) {
			mStringBuilder.append(line + "\n");
		}
		
		content = mStringBuilder.toString();
		
		return content;
	}
	
	//Lista os arquivos do caminho especificado no parâmetro
	public String listFiles(String path) {
		StringBuilder filesList = new StringBuilder();
		String[] pathArray;
		String fragmentFilename;
		
		File mPath = new File(path);
		
		for(File file : mPath.listFiles()) {
			pathArray = String.valueOf(file).split("/");
			fragmentFilename = pathArray[(pathArray.length - 1)];
			filesList.append(fragmentFilename + "\n");
		}
		
		return filesList.toString();
	}
	
}
