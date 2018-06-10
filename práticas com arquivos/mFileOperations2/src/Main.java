import java.util.*;																																														
import java.io.PrintWriter;
import java.io.*;

public class Main {
	
	
	//Gerando as tabuadas:
	public void gerarTabuadas(PrintWriter p, int numberStart, int numberSequencies) {
		
		for(int j = 0; j < numberSequencies; j++) {
		//---------------------------
		p.printf("---Resultado---%d%n",numberStart+j);
		for(int i = 0; i < 11; i++) {
			p.printf("| %d x %d =   %d%n", i, numberStart+j, (i*(numberStart+j)));
		}
		p.println("--------------------");
		p.print("\n\n");
	}

}
//-----------------------------------------------------------------------------------
	
	public static void main(String[] args) throws IOException {
		
		Main main = new Main();
		
		String nomePrefixo = "3 - tabuadas", 
		nomeExtensao = ".txt";
		
		String nomeArquivo = nomePrefixo + nomeExtensao;
		String caminho = "/storage/emulated/0/AppProjects/Java/Testes Projetos";
		
		
		FileWriter arquivo = new FileWriter(caminho + "/" + nomeArquivo);
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		main.gerarTabuadas(gravarArquivo, 1, 20);								
		arquivo.close();
		gravarArquivo.close();
		
	}
}
