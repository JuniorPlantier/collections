package collections.plantier.array;

public class Aplicacao {

	public static void main(String[] args) {
		int[] array;
		array = new int[5];
		
		array[1] = 6;
		array[4] = 7;
		
//		for(int i=0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}

//		for(int valor : array) {
//			System.out.println(valor);
//		}
		
		String array2[] = new String[5];
		array2[0] = "a";
		array2[3] = "d";
		
		for(String vlr : array2) {
			System.out.println(vlr);
		}
		
		Object array3[] = new Object[3];
		array3[0] = "a";
		array3[1] = new Object();
		array3[2] = new int[3];
		array3[3] = 10;
		
		String v1 = (String) array3[0];
		int v2 = (int) array3[3];
		
	}
}
