package operations;																																									
import objects.*;
import java.io.*;
import java.util.*;
import java.text.*;

public class FileOperations {
	
	File diretorio = new File("/storage/emulated/0/AppProjects/Java/Testes Projetos/mFileOperations5");
	
	public void novoCliente(String nome, String sobrenome, String profissao) {
		String prefixoNomeArquivo = nome + " " + sobrenome + "@";
		String extensaoNomeArquivo = ".txt";
		String nomeArquivo = prefixoNomeArquivo + extensaoNomeArquivo;
		
		Cliente cliente = new Cliente(nome, sobrenome, profissao);
		File arquivo = new File(diretorio, nomeArquivo);
		
		//Verificando diretorio
		if(!diretorio.exists()) {
			
		boolean verificaDiretorio = diretorio.mkdir();
		System.out.println(verificaDiretorio? "Diretório de clientes criado!":"Diretório de clientes não existe");
		
		}else{
			
			System.out.println("************************");
			System.out.println("Diretório Atualizado!");
			System.out.println("************************");
			
		}
		
		//Verificando o arquivo e criando fisicamente
		try {
			boolean verificaArquivo = arquivo.createNewFile();
			System.out.println(verificaArquivo);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		// Gravando no arquivo
		try
		{
			FileWriter pegarDados = new FileWriter(arquivo, true);
			PrintWriter gravarDados = new PrintWriter(pegarDados);
			
			String separador = "#";
			
			//Gravando os dados em com um layout Padrão
			gravarDados.print(cliente.getNome() + separador);
			gravarDados.print(cliente.getSobrenome() + separador);
			gravarDados.print(cliente.getProfissao() + separador);
			gravarDados.print(cliente.getNascimento() + separador);
			gravarDados.print(cliente.getDiaNascimento() + separador);
			gravarDados.print(cliente.getMesNascimento() + separador);
			gravarDados.print(cliente.getAnoNascimento() + separador);
			
			//Encerrando sessão
			pegarDados.flush();
			pegarDados.close();
			gravarDados.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void informacoCliente() throws IOException {
		
		//mostrarMensagem("Declarando variáveis");
		String nome = null;
		String sobrenome = null;
		String profissao = null;
		String nascimento = null;
		
		//mostrarMensagem("Exibindo lista");
		listarClientes();
		
		//mostrarMensagem("Declarando HashMap");
		//Local onde serão armazenados os diretorios da lista
		Map<Integer, String> locais = new HashMap<Integer, String>();
		//mostrarMensagem("Declarando contador e position");
		int contador = 0, position = 0;
		
		//mostrarMensagem("iniciando loop para transferir a lista de endereços para o HashMap");
		//loop que armazena os diretotios da lista na lista HashMap
		for(File file:diretorio.listFiles()) {
			contador++;
			locais.put(contador, file.toString());
			//mostrarMensagem("Loop " + contador + ": " + file.toString());
		}
		
		System.out.print("Quem? \n• ");
		position = new Scanner(System.in).nextInt();
		
		//mostrarMensagem("Criando o arquivo contêiner para as informações");
		//Arquivo que armazenará o endereço do arquivo onde estão as 
		//informações do cliente escolhido
		File filedetail = new File(locais.get(position));
		
		//mostrarMensagem("Abrindo bloco de tratamento de erros");
		//Introduzindo a leitura do arquivo
		try {
			//mostrarMensagem("try: instanciando FileReader");
			//Instanciando o FileReader
			FileReader fReader = new FileReader(filedetail);
			
			//mostrarMensagem("try: instanciando BufferedReader");
			//Será usado para acessar o método ReadLine para ler cada linha do arquivo
			BufferedReader bfReader = new BufferedReader(fReader);
			
			//mostrarMensagem("try: Instanciando String que armazenará as informações do cliente");
			//Iniciando a leitura
			//Loop que percorre as linhas do arquivo enquanto o conteúdo
			//delas for diferente de null, armazenando-as em uma String
			String linha = "", conteudo = null;
			
			//mostrarMensagem("try: abrindo novo bloco de tratamento de erros(para a leitura do arquivo)");
			try {
				//mostrarMensagem("try: try: while: loop que atribui o conteúdo do arquivo à String enquanto a linha for diferente de null");
				while ((linha = bfReader.readLine()) != null) {
					
					conteudo = linha;
					//mostrarMensagem("• Conteúdo recebido: \n" + conteudo);
				}
				
				//mostrarMensagem("try: fechando bloco try 2");
				//mostrarMensagem("Declarando o que fazer em caso de erro");
			}
			catch (IOException e){
				e.printStackTrace();
			}
			
			//mostrarMensagem("Instanciando dados[] (Fará um split() para separar as informações entre '#')");
			//Lendo de fato o arquivo e 'disecando' a formatação para pegar os dados:
			String[] dados = conteudo.split("#");
			
			//mostrarMensagem("dados obtidos: " + dados[0] + "\n" + dados[1] + "\n" + dados[2] + "\n" + dados[3]);
			nome = dados[0];
			sobrenome = dados[1];
			profissao = dados[2];
			nascimento = dados[3];
			
			//mostrarMensagem("fechando o fluxo para liberar o arquivo");
			//Fechando o fluxo para liberar o arquivo
			fReader.close();
			bfReader.close();

		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String informacoes = String.format("Nome: %s %s\nProfissão: %s    \nNascimento: %s", nome, sobrenome, profissao, nascimento);

		mostrarMensagem("----------------------------");
		mostrarMensagem("         INFORMAÇÕES\n\n"+informacoes + "\n");
		mostrarMensagem("----------------------------\n\n");
		
	}
	
	public void excluirCliente() {
		
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		int contador = 0, position = 0;
		Scanner scanner = new Scanner(System.in);

		listarClientes();
		Map<Integer,String> locais = new HashMap<Integer, String>();
		
		for(File file: diretorio.listFiles()){
			String diretorioInteiro = file.toString();
			String[] separando = diretorioInteiro.split("/");
			String[] nomeComExtensao = separando[8].split("@");
			String nomeSemExtensao = nomeComExtensao[0];
			//System.out.println((contador + 1) + " " +nomeSemExtensao);
			
			//####################################################
			
			contador++;
			locais.put(contador, file.toString());
	}
	//Lista os pares do HashMap
		for(int i = 1; i < (locais.size() + 1); i++) {
			System.out.println(locais.get(i));
		}
	
		System.out.println("-----------------------------------");
		System.out.print("Quem?(posição) \n* ");
		position = scanner.nextInt();
		
	System.out.println(locais.get(position));
		
		System.out.println("Tamanho de locais: " + locais.size());
		
		//Associa o valor da chave escolhida no Hashmap ao caminho alvo
		File apagarDiretorio = new File(locais.get(position));
		
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		//Informa o andamento da ação
		System.out.println(apagarDiretorio.exists()? "\nCaminho realmente existe. Apagando...\n\n":"\nCaminho descomhecido\n\n");
		//Apaga o arquivo da camada física
		apagarDiretorio.delete();
		
		System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
		//Informa se realmente foi apagado
		System.out.println(apagarDiretorio.exists()? "\n          Arquivo não apagado!\n\n":"\n          O Arquivo Realmente se foi\n\n\n");
	
}
	
	public void listarClientes() {
		
		int contador = 0;
		
		//O Script separa a parte do diretórii que interessa:
		//o pedaço que tem o nome dos clientes, nesse caso,
		//a posição 8 do array gerado por ele
		for(File file: diretorio.listFiles()){
			contador++;
			/*Cada diretorio recebido sera armazenado nessa variável*/
			String separateName = file.toString();
			/*Depois, ela será armazenada nesse array junto à String do
			dietório, e tratada pelo método split, onde sempre que houver
			uma '/', será armazenado o pedaço anterior respectivamente no
			array*/
			String[] separated = separateName.split("/");
			
			/*Novo split para separar o nome da extensão do arquivo, onde
			defini-se que acabou o alvo quando se encomtra um "."*/
			
			String nomeComExtensao = separated[8].toString();
			String[] somenteNome = nomeComExtensao.split("@");
			
			/*Imprimindo o pedaço que contém só o nome do cliente
			(A posição 0 do array)*/
			System.out.println(contador + " • " + somenteNome[0]);
		}
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::");
		
	}	
	
	//Exibe uma mensagem na Output
	public void mostrarMensagem(String mensagem) {
		System.out.println(mensagem);
	}
}

