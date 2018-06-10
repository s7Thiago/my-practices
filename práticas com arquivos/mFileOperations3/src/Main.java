import java.util.*;																																																			
import java.io.*;

public class Main {
	
	/*public File criarDiretorio(String endereco) {
		//Criando o diretorio
		File caminho = new File(endereco);
		//Verificando se o diretorio foi criado
		System.out.println("Criação do caminho: " + caminho.mkdir());
		return caminho;
	}
	
	//Cria um Arquivo com nome, extensão e caminho opcionais
	public void criarArquivo(String prefixo, String extensao, File caminho) {
		//Nome do arquivo
		String nomeArquivo = prefixo + "." + extensao;
		
		//Criando o arquivo no diretorio criado anteriormente
		File arquivo = new File(caminho, nomeArquivo);
		
		
	}*/
	
	public static void main(String[] args) {
		
		//Nome do arquivo
		String prefixo = "mFile";
		String extesao = ".txt";
		String nomeArquivo = prefixo + extesao;

		
		//Criando o diretorio
		File caminho = new File("/storage/emulated/0/AppProjects/Java/Testes Projetos/mFile/");
		boolean statusDir = caminho.mkdir();
		//Verificando se foi criado
		System.out.println(statusDir);
		
		//Criando o objeto do arquivo
		File arquivo = new File(caminho, nomeArquivo);
		//Criando o arquivo
		try {
			boolean statusArquivo = arquivo.createNewFile();
			System.out.println(statusArquivo);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}
}
