import java.io.File;
import java.io.IOException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import objects.UserSave;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String jsonString = "{\n\"user\":{\n\"name\":\"Thiago\",\n\"password\":\"1234567\"\n}\n}";
		JsonObject object = new JsonParser().parse(jsonString).getAsJsonObject().get("user").getAsJsonObject();

		System.out.println(jsonString);
		System.out.println("\n---------Data----------\n");
		System.out.println(
				"Name: " + object.get("name").getAsString() + "\nPassword: " + object.get("password").getAsString());
		
		System.out.println("\n\nCriando um arquivo em disco");
		UserSave save = new UserSave("testando", "Save Content");
		System.out.println("Absolute path: " + save.getAbsolutePath());
	}
}
