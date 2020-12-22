package processment;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import objects.User;

public class GetUsersFromJSON {

	private String jsonContent;

	public GetUsersFromJSON(String jsonString) {
		super();
		setJsonContent(jsonString);

	}

	//
	public List<User> getIt() {
		
		//It will be used to stores the users objects
		List<User> usersList = new ArrayList<User>();
		
		//Will be used to stores the data of each user
		int id = 0, tel = 0;
		String name = null, email = null, password = null;
		
		//Helps perform operations with refered json file
		JsonParser parser = new JsonParser();
		
		//This will serve to instantiate each user object it will be stored in list
		User user = null;
		
		//This serve to provides acess to root array of json file
		JsonArray rootArray = parser.parse(getJsonContent()).getAsJsonArray();
		
		for(JsonElement element : rootArray) {
			//Getting the data
			id = element.getAsJsonObject().get("userid").getAsInt();
			tel = element.getAsJsonObject().get("telefone").getAsInt();
			name = element.getAsJsonObject().get("nome").getAsString();
			email = element.getAsJsonObject().get("email").getAsString();
			password = element.getAsJsonObject().get("senha").getAsString();
			
			//Instantiating the user object
			user = new User(id, tel, name, email, password);
			
			//Adding the object instance in the list
			usersList.add(user);
		}
		
		return usersList;
	}

	//
	public String getJsonContent() {
		return jsonContent;
	}

	//
	private void setJsonContent(String jsonPath) {
		this.jsonContent = jsonPath;
	}

}
