package java_introduction;

public class Matrices {
	
	public static int [][] createRandomMatrix (int rows, int columns, int minValue, int maxValue) {
			int [][]res = new int [rows][columns];
			for(int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					res[i][j] = Numbers.getRandom(minValue, maxValue);
				}
			}
		return res;
	}
	
	public static void printMatrix (int [][] matrix) {
		int i = 0, j = 0;
		for(i = 0; i < matrix.length; i++) {
			System.out.println();
			for (j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
	}
	
	public static int[][] transp (int [][] matrix) {
		
		int [][] res = new int [matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {			
			for (int j = 0; j < matrix[i].length; j++) {
				res[j][i] = matrix[i][j];
			}
		}			
		return res;
	}

}
