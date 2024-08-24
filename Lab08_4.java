
public class Lab08_4 {

	public static void main(String[] args) {
		int n = 4;
		int[][] matrix = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = (Math.random() >= 0.5 ? 1 : 0);
			}
		}
		
		for (int[] a: matrix) {
			for (int e: a) {
				System.out.printf("%2d", e);
			}
			System.out.println();
		}
		int max = 0;
		int maxRow = 0;
		int maxCol = 0;
		for (int r = 0; r < n; r++) {
			int sum = 0;
			for (int c = 0; c < n; c++) {
				sum += matrix[r][c];
			}
			if (sum > max) {
				max = sum;
				maxRow = r;
			}
		}
		System.out.println("First Row with the most 1s: " + maxRow);
		max = 0;
		for (int c = 0; c < n; c++) {
			int sum = 0;
			for (int r = 0; r < n; r++) {
				sum += matrix[r][c];
			}
			if (sum > max) {
				max = sum;
				maxCol = c;
			}
		}
		System.out.println("First Column with the most 1s: " + maxCol);
	}

}
