package collections.plantier.interfaces.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(4, "Arroz", 4.9);
		Produto p2 = new Produto(7, "Feijao", 0.99);
		Produto p3 = new Produto(34, "Lentilha", 7.98);
		Produto p4 = new Produto(1, "Lasanha", 19.43);
		Produto p5 = new Produto(87, "Pão", 0.99);
		Produto p6 = new Produto(98, "Ervilha", 5);
		
		//Set<Produto> produtos = new TreeSet<>();
		//Set<Produto> produtos = new TreeSet<Produto>(new DescricaoComparator());
		
		List<Produto> produtos = new ArrayList<>();
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		produtos.add(p4);
		produtos.add(p5);
		
		//Collections.sort(produtos); // compareTo da classe
		Collections.sort(produtos, new DescricaoComparator());
		
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
