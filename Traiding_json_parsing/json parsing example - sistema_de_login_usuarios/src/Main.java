import java.io.IOException;
import java.util.List;

import objects.User;
import processment.GetUsersFromJSON;
import processment.InnerFileOperator;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//Lst of users
		List<User> usersList = new GetUsersFromJSON(
				new InnerFileOperator("D:\\Git test Workspace\\my-practices\\Traiding_json_parsing\\sisema_de_login-usuarios.json")
				.read())
				.getIt();
		
		for(User user : usersList) {
			System.out.println(user.toString());
		}
		
		}
}
