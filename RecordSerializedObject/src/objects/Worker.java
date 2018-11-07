package objects;

import java.io.Serializable;

import Exceptions.AlreadyAnEmployee;

public class Worker implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6691665777127144126L;
	
	private String name;
	private String lastName;
	private String profession;
	private double salary;
	private long CPF;
	private Enterprise enterprise;
	
	

	public Worker(String name, String lastName, String profession, double salary, long cPF) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.profession = profession;
		this.salary = salary;
		CPF = cPF;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public Enterprise getEnterprise() {
		return enterprise;
	}

	public void setEnterprise(Enterprise enterprise) throws AlreadyAnEmployee{
		
		if(getEnterprise() == null) {
			this.enterprise = enterprise;
		} else {
			throw new AlreadyAnEmployee();
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder data = new StringBuilder();
		
		data.append("\n\nName: ").append(this.getName() + " " + this.getLastName())
		.append("\nProfession: ").append(this.getProfession())
		.append("\nSalary: ").append(String.valueOf(this.getSalary()))
		.append("\nCPF: ").append(String.valueOf(this.getCPF()) + "\n");
		
		return data.toString();
	}

}
