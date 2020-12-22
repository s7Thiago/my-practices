import java.util.*;
import java.io.*;																																															

/*O primeiro método read(byte[]) possibilita a leitura de uma quantidade certa de bytes, em vez 
de ler byte a byte. Isso torna o processo mais rápido e eficaz quando há uma grande quantidade 
de dados a serem lidos. */

public class Main {
	public static void main(String[] args) {
		
		InputStream inputStream;
		
		try{
			
			inputStream = new BufferedInputStream(
				new FileInputStream("/storage/emulated/0/AppProjects/Java/Testes Projetos/TraidingFiles/FileStringArrayList.txt")
			);
			
			byte dataAsByte[] = new byte[17];
			inputStream.read(dataAsByte);
			
			for(int i = 0; i < dataAsByte.length; i++) {
				System.out.print((char) dataAsByte[i]);
			}
			
		}catch(FileNotFoundException e1) {
			e1.printStackTrace();
			
		} catch(IOException e2) {
			e2.printStackTrace();
			
		}
		
	}
}
