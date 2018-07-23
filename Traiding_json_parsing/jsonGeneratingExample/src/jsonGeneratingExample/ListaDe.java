package jsonGeneratingExample;

import java.util.ArrayList;
import java.util.List;

public class ListaDe <T>{
	T objectType;
	List<T> lista = new ArrayList<>();
	
	public void add(T objectType) {
		lista.add(objectType);
	}
	
	public void remove (int position) {
		lista.remove(position);
	}
	
	public void get (int position) {
		lista.get(position);
	}
	
	public String getAll() {
		StringBuilder sb = new StringBuilder();
		for (T objectType : lista) {
			sb.append(objectType.toString() + "\n");
		}
		return sb.toString();
	}
}
