import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;

import objects.User;
import objects.UserSave;
import processment.LoginManager;

public class Main {

	public static void main(String[] args) throws IOException {

		System.out.println("\n\nCriando novo usuário");
		User user = new User();
		user.addNewUserSaveToList("registro de teste 1", "conteúdo do registro de teste 1");
		user.addNewUserSaveToList("registro de teste 2", "conteúdo do registro de teste 2");
		user.addNewUserSaveToList("registro de teste 3", "conteúdo do registro de teste 3");
		user.addNewUserSaveToList("registro de teste 4", "conteúdo do registro de teste 4");
		user.addNewUserSaveToList("registro de teste 5", "conteúdo do registro de teste 5");
		user.addNewUserSaveToList("registro de teste 6", "conteúdo do registro de teste 6");
		user.addNewUserSaveToList("registro de teste 7", "conteúdo do registro de teste 7");

		System.out.println("Listando os saves deste user");
		List<UserSave> listOfSaves = user.getSavesList();
		for (int i = 0; i < listOfSaves.size(); i++) {
			System.out.println(listOfSaves.get(i).getSaveKey());
		}

		LoginManager lm = new LoginManager();
		lm.newUser(user, "Ana", "ana@example.com", "123password", "123password");
		lm.newUser(user, "carlos", "carlos@example.com", "1234password", "1234password");
		lm.newUser(user, "Paulo", "paulo@example.com", "12345password", "12345password");
		
		Gson gson = new Gson();
		String userToJson = String.valueOf(gson.toJson(lm, LoginManager.class));

		// user.addNewUserSaveToList("user to json", userToJson);

		System.out.println("\n\n----------json----------\n\n" + userToJson);
	}
}
