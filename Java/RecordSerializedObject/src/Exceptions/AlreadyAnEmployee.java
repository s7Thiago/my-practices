package Exceptions;

public class AlreadyAnEmployee extends Exception {
	
	public AlreadyAnEmployee() {
		// TODO Auto-generated constructor stub
		System.err.println("este funcionario ja existe em uma empresa");
	}
	
}
