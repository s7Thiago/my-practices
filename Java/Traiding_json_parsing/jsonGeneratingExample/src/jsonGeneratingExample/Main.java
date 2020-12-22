package jsonGeneratingExample;

import java.io.IOException;

import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) throws IOException {
		Gson gson = new Gson();
		String json1, json2, json3;
		
		Pessoa pessoa = new Pessoa("Thiago", 21, "Programador");
		pessoa.addHabilidade("MySQL", "Construção de bancos de dados relacionais em MySQL");
		pessoa.addHabilidade("Android", "Contrução de aplicações para o sistema Android");
		pessoa.addHabilidade("Java", "Contrução de algoritmos em JavaSE");
		pessoa.addHabilidade("Firebase", "Contrução de aplicativos android com Firebase no backend para login ou database");
		pessoa.addHabilidade("GitHub", "Utilização de sistema de versionamento para compartilhar o código com uma equipe para trabalhar remotamente e organizar o mesmo");
		
		Pessoa pessoa2 = new Pessoa("ana", 23, "Engenheira de Alimentos");
		pessoa2.addHabilidade("Culinária 1", "Preparação de alimentos porvenientes da culinária japonesa");
		pessoa2.addHabilidade("Provador", "Análise da composição de alimentos pelo paladar");
		pessoa2.addHabilidade("Chefe", "Amplo conhecimento em processos de preparação, e boa aptidão para liderança");
		pessoa2.addHabilidade("Arte", "Idealização e confecção de alimentos artesanais");
		pessoa2.addHabilidade("Culinária 2", "Preparação de alimentos porvenientes da culinária belga");
		
		//Armazenando conversões
		json1 = (String) gson.toJson(pessoa, Pessoa.class);
		json2 = (String) gson.toJson(pessoa2, Pessoa.class);
		
		//Exibindo conversões
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
