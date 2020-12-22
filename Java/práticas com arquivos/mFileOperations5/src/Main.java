import java.util.*;																																														
import operations.FileOperations;
import java.io.*;

public class Main {
	

	//Menu
	String[] optionsMenu = new String[]{"Novo", "Detalhar", "Excluir", "Listar"};
	
	public void mostrarMenu() {
		for(int i = 0; i < optionsMenu.length; i++) {
			System.out.println((i + 1)  +  " – " + optionsMenu[i].toString());
		}
	System.out.println("-------------------------");
	}
	
	// Novo
	public void novoCliente() {
		FileOperations operation = new FileOperations();
		
		String nome = null, sobrenome = null, profissao = null;
		Scanner s = new Scanner(System.in);

		System.out.print("Nome: ");
		nome = s.nextLine();

		System.out.print("Sobrenome: ");
		sobrenome = s.nextLine();

		System.out.print("Profissão: ");
		profissao = s.nextLine();
		operation.novoCliente(nome, sobrenome, profissao);
	}
	
	public void executar() throws IOException {
		
		FileOperations f = new FileOperations();
		
		int option = 0;
		do{
			Scanner scanner = new Scanner(System.in);
			
			mostrarMenu();
			
			System.out.print("Escolha a opção: ");
			option = scanner.nextInt();
			
			switch(option) {
				case 1:
					novoCliente();
					break;
					
				case 2:
					f.informacoCliente();
					break;
					
				case 3:
					f.excluirCliente();
					break;
					
				case 4:
					f.listarClientes();
					break;

			}

		}while(option != 0);
		
		
	}
	
	public static void main(String[] args) throws IOException {
		
		Main main = new Main();
		
		main.executar();
		
	}
}
