package objects;

public class Pessoa {

	private int id;
	private String nome;
	private String sobrenome;

	public Pessoa(int id, String nome, String sobrenome) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Pessoa() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The people number " + getId() + " is called " + getNome() + " " + getSobrenome() + ".";
	}

}
