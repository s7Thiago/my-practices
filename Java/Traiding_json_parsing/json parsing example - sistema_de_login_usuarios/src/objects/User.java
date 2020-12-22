package objects;

public class User {

	private int userid;
	private int tel;
	private String name;
	private String email;
	private String password;

	public User(int userid, int tel, String name, String email, String password) {
		super();
		this.userid = userid;
		this.tel = tel;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public User() {
		
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Data of user " + getUserid() + ": \n"
				+ "\nName: " + getName()
				+ "\nE-mail: " + getEmail()
				+ "\nPassword: " + getPassword()
				+ "\n------------------------------------------------------\n";
	}

}
