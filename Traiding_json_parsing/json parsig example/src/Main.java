import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import objects.Pessoa;
import processment.InnerFile;
import processment.InnerJSONPaser;

public class Main {

    public static void main(String args[]) throws IOException {

       String jsonContent = new InnerFile().read("D:\\Git test Workspace\\my-practices\\Traiding_json_parsing\\pessoas.json");
        
        List<Pessoa> listaDePessoas = new InnerJSONPaser().getPessoaFromJson(jsonContent);
        
        listaDePessoas.forEach(pessoa -> System.out.println(pessoa.toString()));
    }
}
