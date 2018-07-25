package processment;

import java.util.ArrayList;
import java.util.List;

import objects.User;
import objects.UserSecurityData;

public class LoginManager {

	private List<User> usersList = new ArrayList<User>();

	//Constructors, getters and setters
	public List<User> getUsersList() {
		return usersList;
	}

	public void setUsersList(List<User> usersList) {
		this.usersList = usersList;
	}

	public void signIn(String userName, String pass) {

	}

	public void signOut() {

	}

	public void newUser(String name, String lastName, String userName, String email, String pass, String passCofirmation) {
		User user = null;
		usersList.add(user = new User(name, lastName, new UserSecurityData(userName, email, pass)));
	}
	
	public void newUser(User user, String userName, String email, String pass, String passCofirmation) {
		
		usersList.add(user = new User(user.getName(), user.getLastName(), new UserSecurityData(userName, email, pass)));
	}

	public void deleteUser(User user) {

	}

	//End of constructors, getters and setters
}
