package collections.plantier.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		
		lista.add("abc");
		lista.add("def");
		//lista.set(0, "ghi"); // substitui a posição zero
		lista.add(0, "ghi");
		
		for(String s : lista) {
			System.out.println(s);
		}
		
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		Iterator<String> iteretor = lista.iterator();
		while(iteretor.hasNext()) {
			System.out.println(iteretor.next());
		}
		
	}
}
