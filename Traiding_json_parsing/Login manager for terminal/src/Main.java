import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jsonString = "{\n\"user\":{\n\"name\":\"Thiago\",\n\"password\":\"1234567\"\n}\n}";
		JsonObject object = new JsonParser().parse(jsonString).getAsJsonObject().get("user").getAsJsonObject();

		System.out.println(jsonString);
		System.out.println("\n---------Data----------\n");
		System.out.println(
				"Name: " + object.get("name").getAsString() + "\nPassword: " + object.get("password").getAsString());

	}
}
