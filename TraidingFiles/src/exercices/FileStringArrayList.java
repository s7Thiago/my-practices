package exercices;																																				
import java.util.*;
import persistence.*;
import java.io.*;

public class FileStringArrayList {
	
	private ArrayList<String> registros = new ArrayList();
	private String content;
	
	public FileStringArrayList(boolean execute) throws IOException {
		
		if(execute) {
	for(int i = 0; i < 200; i++) {
		registros.add("Registro " + i);
		content += registros.get(i) + "\n";
	} 
	
			new FileOperations().writeImFile((new FileOperations().createNewFile("/storage/emulated/0/AppProjects/Java/Testes Projetos/TraidingFiles", "FileStringArrayList.txt")), content, true);
	}else{
		System.out.println("FileStringArrayList desativado");
			}
			}
}
