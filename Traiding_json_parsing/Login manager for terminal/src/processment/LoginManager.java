package processment;

import java.util.ArrayList;
import java.util.List;

import objects.User;

public class LoginManager {

	private List<User> usersList = new ArrayList<User>();

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

	public void newUser(String userName, String pass, String passCofirmation) {

	}

	public void deleteUser(User user) {

	}
}
