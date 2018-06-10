import java.util.*;
import java.io.*;																																																		

public class Main {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//new ConcatenandoString();
		new ConcatenaString2();
		new Test1("Thiago", "Sousa");
		
		Test1 content = new Test1("Thiago", "Sousa");
		mFile x = new mFile();
		
		System.out.println("\n\nFazendo a leitura do arquivo");
		
		System.out.println(x.read(x.write(x.create(content.getClass().toString(), "/storage/emulated/0/.ajax"), content.toString())));
		
		//System.out.println("Conteúdo do arquivo: \n\n" + new mFile().read(file));
		
		}
}
