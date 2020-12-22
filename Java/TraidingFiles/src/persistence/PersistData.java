package persistence;

import java.io.*;
import objects.*;
import exeption.*;																														

public class PersistData {
	
	public static final File DEFAULT_PATH = new File("/sdcard/AppProjects/Java/Testes Projetos/TraidingFiles");
	
	public void newProduct(String name, String description, 
int code, float value, String vality, String vendor, 
int quantity, boolean avaliable) throws IOException, MyExeption {
	
	Product product = new Product(name, description, code, value, vality, vendor, quantity, avaliable);
	//.esp = example stock products
	File file = new File(DEFAULT_PATH, (name + "-" + code + ".esp"));
	
	DEFAULT_PATH.mkdirs();
	file.createNewFile();
	
	//Escrevendo no arquivo
	FileWriter fw = new FileWriter(file, true);
	PrintWriter pw = new PrintWriter(fw);
	
	pw.print("#name&" + name + "\n#description&" + description + "\n#code&" + code
	+ "\n#value&" + value + "\n#vality&" + vality + "\n#vendor&"+ vendor + 
	"\n#quantity&" + quantity
	+ "" + avaliable);
	
	//Fechando todos os fluxos para liberar o arquivo
	fw.flush();
	fw.close();
	pw.flush();
	pw.close();
	}
	
	public void listFiles() {
		
		for(File dirs: DEFAULT_PATH.listFiles()) {
			
			System.out.println(dirs);
		}
	}
	
}
