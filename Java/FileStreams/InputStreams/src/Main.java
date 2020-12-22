import java.io.FileInputStream;																														
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main{
	
	public static void main(String[] args) {
		
		InputStream inputstream;
		try {
			inputstream = new FileInputStream("/storage/emulated/0/AppProjects/Java/Testes Projetos/TraidingFiles/FileStringArrayList.txt");

			int data = inputstream.read();
			while (data != -1) {
				System.out.print((char) data);

				data = inputstream.read();

			}
			inputstream.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
