import java.util.*;
import java.io.*;

/*o BufferedInputStream que diferente do FileInputStream, que lê byte a byte, este lê um bloco inteiro de uma só vez, agilizando
o processamento de leitura no disco. Um exemplo prático: Se o seu arquivo possui 32768 bytes, para que um FileInputStream possa 
ler ele por completo, ele precisará fazer 32768 chamadas ao Sistema Operacional. Com um BufferedInputStream você precisará de 
apenas quadro chamadas, isso porque o BufferedInputStream armazena 8192 bytes em um buffer e os utiliza quando precisa. Resumindo, 
você deve usar o BufferedInputStream como um wrapper para o FileInputStream quando desejar ganhar mais velocidade.*/

public class Main
{
	public static void main(String[] args) {
		InputStream inputStream;
		 
		try {
			
			inputStream = new BufferedInputStream(
				new FileInputStream("/storage/emulated/0/AppProjects/Java/Testes Projetos/TraidingFiles/FileStringArrayList.txt"));
				
				int data = inputStream.read();
				
				while(data != -1) {
					System.out.print((char) data);
					
					data = inputStream.read();
				}
			
		} catch(FileNotFoundException e1) {
			e1.printStackTrace();
			
		} catch(IOException e2) {
			e2.printStackTrace();
		}
	}
}
