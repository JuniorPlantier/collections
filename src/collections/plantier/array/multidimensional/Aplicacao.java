package collections.plantier.array.multidimensional;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		int[][] array = new int[5][2];
		array[3][1] = 33;
		array[2][1] = 32;
		array[0][1] = 30;
		
		for(int i=0; i < array.length; i++ ) {
			for(int j=0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
