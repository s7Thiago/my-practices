package jsonGeneratingExample;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private int idade;
	private String profissao;
	private List<Habilidade> habilidades = new ArrayList<>();

	public Pessoa(String nome, int idade, String profissao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
	}

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public void addHabilidade(String titulo, String descricao) {
		habilidades.add(new Habilidade(titulo, descricao));
	}
	
	public void addHabilidade(Habilidade habilidade) {
		habilidades.add(habilidade);
	}
	
	public void removerHabilidade(int posicao) {
		habilidades.remove(posicao);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return new StringBuffer().append("Nome: " + getNome()).append("Idade: " + getIdade())
				.append("Profissao: " + getProfissao()).toString();
	}

}
