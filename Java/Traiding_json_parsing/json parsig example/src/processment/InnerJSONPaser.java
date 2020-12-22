package processment;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import objects.Pessoa;

public class InnerJSONPaser {

	// Extrai cada objeto pessoa do json com a estrutura correta
	public List<Pessoa> getPessoaFromJson(String jsonString) {

		// Responsible to provide the manipulation abilities of json files
		JsonParser parser = new JsonParser();

		// Extracting the root array from json
		JsonArray rootArray = parser.parse(jsonString).getAsJsonArray();

		// Stores the data that will be received of json file
		String name = null, lastName = null;
		int id = 0;

		// It will be used for instantiate the differents Pessoas kinds that they are
		// stored in json file
		Pessoa pessoa;

		// It will be used for store each Pessoa object
		List<Pessoa> pessoasList = new ArrayList<Pessoa>();
		
		//for each Pessoa element in rootArray, acess the name and the last name values, 
		//and instantiates an Pessoa object putting the fields in the respective parameter
		for(JsonElement element : rootArray) {
			
			id = element.getAsJsonObject().get("userid").getAsInt();
			name = element.getAsJsonObject().get("nome").getAsString();
			lastName = element.getAsJsonObject().get("sebrenome").getAsString();
			
			//instantiates an Pessoa object for add to list
			pessoa = new Pessoa(id, name, lastName);
			
			pessoasList.add(pessoa);
		}
		
		return pessoasList;
	}
}














