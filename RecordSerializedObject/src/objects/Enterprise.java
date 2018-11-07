package objects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import Exceptions.AlreadyAnEmployee;

public class Enterprise implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9165882514706748979L;
	
	private String name;
	private String sector;
	private List<Worker> employees;
	private long cnpj;

	public Enterprise() {
		super();
		// TODO Auto-generated constructor stub
		employees = new ArrayList<>();
	}

	public Enterprise(String name, String sector, int cnpj) {
		super();
		this.name = name;
		this.sector = sector;
		this.cnpj = cnpj;
		
		employees = new ArrayList<>();
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public Worker getEmployeeData(int cpf) {

		for (Worker employee : employees) {
			if (employee.getCPF() == cpf) {
				return employee;
			}
		}

		return null;
	}

	public void addEmployee(Worker employee) throws AlreadyAnEmployee {
		employee.setEnterprise(this);
		this.employees.add(employee);
	}

	@Override
	public String toString() {
		StringBuilder data = new StringBuilder();
		
		data.append("\nName: ").append(getName())
		.append("\nSector: ").append(getSector())
		.append("\nCNPJ: ").append(getCnpj())
		.append("\n\n----------Employees List----------\n");
		
		for(Worker employee : employees) {
			data.append(employee.toString())
			.append("_________________________");
		}
		
		return data.toString();
	}
}
