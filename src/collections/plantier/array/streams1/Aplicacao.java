package collections.plantier.array.streams1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Aplicacao {

	private static List<String> itens = Arrays.asList("computador","papel","caneta","quadro","borracha","cortina","gaveta");
	
	private static List<Produto> produtos;
	
	static {
		produtos = new ArrayList<Produto>();
		produtos.add(new Produto(1, "Batata", 4.87));
		produtos.add(new Produto(2, "Cebola", 1.99));
		produtos.add(new Produto(3, "Tomate", 7.77));
		produtos.add(new Produto(4, "Cenoura", 2.12));
		produtos.add(new Produto(5, "Beterraba", 9.43));
	}
	
	public static void main(String[] args) {
		//executar1();
		//executar2();
		//executar3();
		//executar4();
		//executar5();
		executar6();
	}
	
	private static void executar1() {
		// 1. ordernar
		// 2. manter só os 3 primeiros elementos
		// 3. mostrar o resultado na tela
		
		itens.stream().sorted().limit(3).forEach(System.out::println);
	}
	
	private static void executar2() {
		// 1. filtrar só elementos com a letra "c"
		// 2. montar uma nova lista com estes elementos
		
		List<String> itensFiltrados = itens.stream().filter(e -> e.contains("c")).collect(Collectors.toList());
		System.out.println(itensFiltrados);
	}
	
	private static void executar3() {
		// 1. somar a qtd de caracteres de todos os elementos
		// 2. retornar a soma
		
		int total = itens.stream().collect(Collectors.summingInt(e -> e.length()));
		System.out.println(total);
	}
	
	private static void executar4() {
		// 1. ordernar os produtos por preco
		// 2. converter os preços em dólar
		// 3. mostrar os dados do produto na tela
		
		double cotacao = 4;
		
		produtos.stream()
			.sorted((e1, e2) -> new Double(e1.getValor()).compareTo(e2.getValor()))
			.map(p -> new Produto(p.getId(), p.getDescricao(), p.getValor()/cotacao))
			.forEach(p -> System.out.println(p.getDescricao()+" -> "+p.getValor()));
	}
	
	private static void executar5() {
		// criar um Map onde a chave é o ID e o valor é o nome do produto
		
		Map<Integer, String> map =
				produtos.stream().collect(Collectors.toMap(p -> p.getId(), p -> p.getDescricao()));
		
		System.out.println(map);
	}
	
	private static void executar6() {
		// criar uma representação de texto dos produtos > transformar a lista de produtos numa String
		
		String str = 
		   produtos.stream()
			.map(p -> String.format("%d:%s:%.2f", p.getId(), p.getDescricao(), p.getValor()))
			.collect(Collectors.joining(";"));
		
		System.out.println(str);
	}
}
