package collections.plantier.varargs;

public class Aplicacao {

	public static void main(String[] args) {
		imprimir("a");
		imprimir("a", "b", "c");
		imprimir();
		
		String[] array = {"a", "b", "c", "d", "e"};
		imprimir(array);
	}
	
	private static void imprimir(String... textos) {
		for(int i=0; i < textos.length; i++) {
			System.out.println(textos[i]);
		}
	}
}
