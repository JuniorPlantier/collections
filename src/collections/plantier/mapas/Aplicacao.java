package collections.plantier.mapas;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* Significa mapear uma chave para um valor específico
 * A gande vantagem está na localização, na chave;
 */
public class Aplicacao {

	public static void main(String[] args) {
		
		//Map<Integer, Produto> map = new HashMap<>();
		//Map<Integer, Produto> map = new LinkedHashMap<>();
		Map<Integer, Produto> map = new TreeMap<>();
		
		Produto p1 = new Produto(1, "Mouse sem fio");
		Produto p2 = new Produto(20, "Bola de basquete");
		Produto p3 = new Produto(3, "Chave");

		map.put(1, p1);
		map.put(20, p2);
		map.put(3, p3);
		
		//Produto p = map.get(2);
		
		Set<Integer> keys = map.keySet();
		for(Integer key : keys) {
			System.out.println(key);
		}
		
		Collection<Produto> values = map.values();
		for(Produto p : values) {
			System.out.println(p);
		}
		
		// conjunto, cujo os elementos é um Map.Entry, que dentro dela tem uma chave e um valor
		Set<Map.Entry<Integer, Produto>> entries = map.entrySet();
		for(Map.Entry<Integer, Produto> entry : entries) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
}
