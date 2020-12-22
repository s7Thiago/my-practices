/*como utilizar as classes FileWriter e PrinterWriter
na criação e gravação de dados baseada em caracteres
para um arquivo de texto. Os métodos print(), println()
e printf() são aplicados na gravação de caracteres*/

import java.util.*;
import java.io.*;																																								

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		Scanner ler = new Scanner(System.in);
		
		//Estruturando o nome do arquivo(Opcional):
		String prefixo = "tabuada", extensao = "txt";
		//Unindo as partes do nome:
		String nomeArquivo = prefixo + "." + extensao;
		
		//Caminho onde será salvo o arquivo
		String caminho = "/storage/emulated/0/AppProjects/Java/Testes Projetos/";
		
		//Variáveis de uso
		int i, n;
		
		System.out.print("Informe o número para a tabuada: ");
		n = ler.nextInt();
		
		//1•      Abrindo o caminho do arquivo
		/*O arquivo externo "tabuada.txt" é aberto para
		operações de saída através do objeto 'arquivo' instanciado
		e criado a partir da classe FileWriter.*/
		FileWriter arquivo = new FileWriter(caminho + nomeArquivo);
		
		//2•      Gravando o arquivo
		/*O objeto de gravação 'gravarArquivo' é associado a um fluxo
		de saída de dados baseado em caracteres através da classe
		PrinterWriter.*/
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		//3•      Gravando no arquivo
		/*Definido o arquivo de texto externo, foi implementado o processo
		de repetição (for) para montar a tabuada de n gravando o resultado
		no arquivo, que é fechado através do método close().Observe que os 
		símbolos %n usados no método printf() gravam um pula linha (caractere
		de escape \n) no arquivo de saída.*/
		gravarArquivo.printf("+-----Resultado-----+%n");
		for(i = 0; i < 10; i++) {
			gravarArquivo.printf("   |%d x %d = %d| %n", i, n, (i*n));
		}
		
		gravarArquivo.printf("+-------------------+%n");
		
		//Fechando o arquivo
		arquivo.close();
		
		//System.out.printf("A tabuada do %d foi gravada com sucesso no caminho\n %s", n, caminho);
		
		//##############################################################################
		//Exibindo na Output
		
		System.out.printf("\n+-----Resultado-----+%n");
		for(i = 0; i < 10; i++) {
			System.out.printf("   |%d x %d = %d| %n", i, n, (i*n));
		}

		System.out.printf("+-------------------+%n");

		

		System.out.printf("A tabuada do %d foi gravada com sucesso no caminho\n %s", n, caminho);
		
	}
}
