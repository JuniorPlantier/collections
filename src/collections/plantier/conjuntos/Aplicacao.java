package collections.plantier.conjuntos;

import java.util.Set;
import java.util.TreeSet;

public class Aplicacao {

	public static void main(String[] args) {
		// no Set não temos índices para os elementos, isso é coisa de array e lista
		
		//Set<String> set = new HashSet<>();
		//Set<String> set = new LinkedHashSet<>(); 
		Set<String> set = new TreeSet<>(); // sempre q uma coleção começar com TREE faz a ordenação dos elementos
		
		set.add("b8");
		set.add("a7");
		set.add("c1");
		set.add("d8");
		set.add("e9");
		set.add("f4");
		set.add("g2");
		set.add("h4");
		set.add("h4");
		set.add("h4");
		
		for(String s : set) {
			System.out.println(s);
		}
	}
}
