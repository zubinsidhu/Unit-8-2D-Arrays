//import java.util.Scanner;
public class TwoDArraysPractice {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		System.out.print("");
		int rows = 4;
		int col = 5;
		int[][] matrix = createMatrix(rows, col);
		printMatrix(matrix);
		
		System.out.println("\nSum of all elements: " + sumMat(matrix));
		System.out.println("\nSum of Rows: ");
		sumRow(matrix);
		System.out.println("\nSum of Columns: ");
		sumColumn(matrix);
		
		System.out.println("\nShuffled Array: ");
		shuffleMat(matrix);
		printMatrix(matrix);
	}

	public static int[][] createMatrix(int rows, int col){
		int[][] result = new int[rows][col];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
				result[i][j] = (int)(Math.random() * 100);
			}
		}
		return result;
	}
	
	public static void printMatrix(int[][] m) {
		/*
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
		*/
		for (int[] a: m) {
			for (int e: a) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
	
	public static int sumMat(int[][] m) {
		/*
		//Summing all elements
		int sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				sum += m[i][j];
			}
		}
		return sum; 
		 */
		
		// Summing all elements using for-each loop
		int sum = 0;
		for (int[] a: m) {
			for (int e: a) sum += e;
		}
		return sum; 
	}
	
	/* Summing elements by row */
	public static void sumRow(int[][] m) { 
		for (int r = 0; r < m.length; r++) {
			int sumR = 0;
			for (int c = 0; c < m[r].length; c++) {
				sumR += m[r][c];
			}
			System.out.println("Sum of row " + r + ": " + sumR);
		}
	}
	
	/* Summing elements by column */
	public static void sumColumn(int[][] m) { 
		for (int c = 0; c < m[0].length; c++) {
			int sumCol = 0;
			for (int r = 0; r < m.length; r++) {
				sumCol += m[r][c];
			}
			System.out.println("Sum of column " + c + ": " + sumCol); 
		}
	}
	
	/* Random Shuffling */
	public static void shuffleMat(int[][] m) { 
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				int newI = (int)(Math.random() * m.length);
				int newJ = (int)(Math.random() * m[i].length); 
				// swap m[i][j] with m[newI][newJ]
				int temp = m[i][j];
				m[i][j] = m[newI][newJ];
				m[newI][newJ] = temp;
			} 
		}
	}
}