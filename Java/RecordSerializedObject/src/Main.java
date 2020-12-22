import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Exceptions.AlreadyAnEmployee;
import objects.Enterprise;
import objects.Worker;

public class Main {

	public static void main(String[] args) {
		String filename = "mocrosoft_employee_data.txt";

		// Criando a empresa e adiconando funcionarios
		Enterprise microsoft = new Enterprise("Microsoft", "TI", 555578496);
		Enterprise recovered = null;
		try {
			microsoft.addEmployee(new Worker("Marcos", "Silva", "Designer", 6000.0, 54574123));
			microsoft.addEmployee(new Worker("Maria", "Carvalho", "Gerente de Projetos", 8599.00, 549632154));
			microsoft.addEmployee(new Worker("Fernando", "Silva", "Analista de Sistemas", 7599.00, 784634154));
		} catch (AlreadyAnEmployee e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Gravando uma cópia serializada dos dados da empresa criada.
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(microsoft);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Extraindo os dados do arquivo serializado
		try {
			
		InputStream fis = new BufferedInputStream(new FileInputStream(filename));
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		recovered = (Enterprise) ois.readObject();
			
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Exbindo os dados extraídos:
		System.out.println(recovered.toString());
		
	}

}
