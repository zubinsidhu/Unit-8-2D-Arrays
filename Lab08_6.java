
public class Lab08_6 {

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
		boolean isSameOnRow = false, isSameOnCol = false;
		for (int r = 0; r < n; r++) {
			boolean allSame = true;
			for (int c = 0; c < n; c++) {
				if (matrix[r][c] != matrix[r][0]) {
					allSame = false;
					break;
				}
			}
			if (allSame) {
				System.out.println("Row " + r + " has all " + matrix[r][0] + "'s");
				isSameOnRow = true;
			}
		}
		for (int c = 0; c < n; c++) {
			boolean allSame = true;
			for (int r = 0; r < n; r++) {
				if (matrix[r][c] != matrix[0][c]) {
					allSame = false;
					break;
				}
			}
			if (allSame) {
				System.out.println("Column " + c + " has all " + matrix[0][c] + "'s");
				isSameOnCol = true;
			}
		}
		
		boolean allSame = true;
		for (int r = 0; r < n; r++) {
			if (matrix[r][r] != matrix[0][0]) {
				allSame = false;
				break;
			}
		}
		if (allSame) {
			System.out.println("Diagonal has all " + matrix[0][0] + "'s");
		}
		else {
			System.out.println("Diagonal has no same");
		}
		
		if (!isSameOnRow) System.out.println("No Row has all same");
		if (!isSameOnCol) System.out.println("No Column has all same");
	}
}