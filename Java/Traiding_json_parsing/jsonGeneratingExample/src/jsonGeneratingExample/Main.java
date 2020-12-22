package jsonGeneratingExample;

import java.io.IOException;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
		String json1, json2, json3;
		
		Pessoa pessoa = new Pessoa("Thiago", 21, "Programador");
		pessoa.addHabilidade("MySQL", "Constru��o de bancos de dados relacionais em MySQL");
		pessoa.addHabilidade("Android", "Contru��o de aplica��es para o sistema Android");
		pessoa.addHabilidade("Java", "Contru��o de algoritmos em JavaSE");
		pessoa.addHabilidade("Firebase", "Contru��o de aplicativos android com Firebase no backend para login ou database");
		pessoa.addHabilidade("GitHub", "Utiliza��o de sistema de versionamento para compartilhar o c�digo com uma equipe para trabalhar remotamente e organizar o mesmo");
		
		Pessoa pessoa2 = new Pessoa("ana", 23, "Engenheira de Alimentos");
		pessoa2.addHabilidade("Culin�ria 1", "Prepara��o de alimentos porvenientes da culin�ria japonesa");
		pessoa2.addHabilidade("Provador", "An�lise da composi��o de alimentos pelo paladar");
		pessoa2.addHabilidade("Chefe", "Amplo conhecimento em processos de prepara��o, e boa aptid�o para lideran�a");
		pessoa2.addHabilidade("Arte", "Idealiza��o e confec��o de alimentos artesanais");
		pessoa2.addHabilidade("Culin�ria 2", "Prepara��o de alimentos porvenientes da culin�ria belga");
		
		//Armazenando convers�es
		json1 = (String) gson.toJson(pessoa, Pessoa.class);
		json2 = (String) gson.toJson(pessoa2, Pessoa.class);
		
		//Exibindo convers�es
		System.out.println("\n------Dados da pessoa 1------\n" + json1);
		System.out.println("\n\n------Dados da pessoa 2------\n" + json2);
		
		System.out.println("\n\n------Lista de pessoas------\n");
		
		ListaDe<Pessoa> listaDePessoas = new ListaDe<Pessoa>();
		listaDePessoas.add(pessoa);
		listaDePessoas.add(pessoa2);
		
		json3 = (String) gson.toJson(listaDePessoas, ListaDe.class);
		System.out.println(json3);
		
		//Criando arquivos e gravando as Strings em json
		InnerFile mFile = new InnerFile("arquivo1");
		mFile.write(json1);
		
		InnerFile mFile2 = new InnerFile("arquivo2");
		mFile2.write(json2);
		
		InnerFile mFile3 = new InnerFile("arquivo3");
		mFile3.write(json3);
	}
}
