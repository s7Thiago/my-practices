package objects;
import java.util.*;

public class Cliente {
	
	private String nome;
	private String sobrenome;
	private String profissao;
	private String estado_civil;
	private String cpf;
	private String nascimento;
	private int diaNascimento;
	private int mesNascimento;
	private int anoNascimento;

	public Cliente(String nome, String sobrenome)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public Cliente(String nome, String sobrenome, String profissao)
	{
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.profissao = profissao;
		
		definirDataNascimento(this);
	}

	private void setNascimento(String nascimento)
	{
		this.nascimento = nascimento;
	}

	public String getNascimento()
	{
		return nascimento;
	}
	
	public String definirDataNascimento(Cliente cliente) {
		
		int dia = 0, mes = 0, ano = 0;
		String nascimento, diaN, mesN, anoN;
		Scanner s = new Scanner(System.in);
		
		System.out.println("------------------------------------");
		System.out.print("\nDefinir data de nascimento\n\n");
		System.out.print("| Dia: \n•");
		dia = s.nextInt();
		
		System.out.print("| Mês: \n•");
		mes = s.nextInt();
		
		System.out.print("| Ano: \n•");
		ano = s.nextInt();
		
		diaN = String.valueOf(dia);
		mesN = String.valueOf(mes);
		anoN = String.valueOf(ano);

		nascimento = diaN + "/" + mesN + "/" + ano;
		
		cliente.setDiaNascimento(dia);
		cliente.setMesNascimento(mes);
		cliente.setMesNascimento(ano);
		
		setNascimento(nascimento);
		
		return nascimento;
	}

	public void setDiaNascimento(int diaNascimento)
	{
		this.diaNascimento = diaNascimento;
	}

	public int getDiaNascimento()
	{
		return diaNascimento;
	}

	public void setMesNascimento(int mesNascimento)
	{
		this.mesNascimento = mesNascimento;
	}

	public int getMesNascimento()
	{
		return mesNascimento;
	}

	public void setAnoNascimento(int anoNascimento)
	{
		this.anoNascimento = anoNascimento;
	}

	public int getAnoNascimento()
	{
		return anoNascimento;
	}
	
	


	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return nome;
	}

	public void setSobrenome(String sobrenome)
	{
		this.sobrenome = sobrenome;
	}

	public String getSobrenome()
	{
		return sobrenome;
	}

	public void setProfissao(String profissao)
	{
		this.profissao = profissao;
	}

	public String getProfissao()
	{
		return profissao;
	}

	public void setEstado_civil(String estado_civil)
	{
		this.estado_civil = estado_civil;
	}

	public String getEstado_civil()
	{
		return estado_civil;
	}

	public void setCpf(String cpf)
	{
		this.cpf = cpf;
	}

	public String getCpf()
	{
		return cpf;
	}
}
