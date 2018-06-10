import java.util.*;
import persistence.PersistData;
import java.io.*;
import exeption.*;
import exercices.*;
import persistence.*;																																			

public class Main {
	private static final String MSG_1 = "Digite a opção desejada: ";
	private static final String MSG_2 = "Opção inválida";
	String[] optionsMenu = new String[]{"Novo", "Listar", "Atividade 1"};
	
	public void showMenu() {
		
		for(int i = 0; i < optionsMenu.length; i++) {
			System.out.println((i + 1) + "- " + optionsMenu[i]);
		}
	}
	
	public void execute() throws IOException {
		int option = 0;
		do{
			showMenu();
			System.out.print("\n\n" + MSG_1);
			option = new Scanner(System.in).nextInt();
			
			switch(optionsMenu[option - 1]) {
				case "Novo": 
					break;
				
				case "Listar":
					System.out.println(new FileOperations().listFiles(String.valueOf(PersistData.DEFAULT_PATH)));
					break;
					
				case "Atividade 1":
					new FileStringArrayList(true);
					break;
				
				default:
				System.out.println("\n\n" + MSG_2 + "!!!\n\n");
				break;
			}
			
		}while(String.valueOf(option) != "");
	}
	
	public static void main(String[] args) throws IOException {
		
		Main main = new Main();
		PersistData p = new PersistData();
		
		main.execute();
		
		try
		{
			p.newProduct("teste", null, 06513, 0.0f, null, null, 0, false);
			p.newProduct("teste2", null, 06514, 0.0f, null, null, 0, false);
			p.newProduct("teste3", null, 06515, 0.0f, null, null, 0, false);
		}
		catch (MyExeption e){
			e.printStackTrace();
		}
		
		p.listFiles();
	}
}
