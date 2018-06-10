import java.util.*;																									

public class Main
{
	public static void main(String[] args) {
		
		String itens[] = new String[]{"Arroz", "Feijão", "Macarrão" , "Sal", "Suco", "Carne"};
		
		for(String item : itens) {
			itens[itens.length-5] = "item";
			System.out.println(item);
		}
		
	}
}
