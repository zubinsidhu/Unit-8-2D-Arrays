
public class Lab08_1 {

	public static void main(String[] args) {
		double[][] matrix = new double[4][4];
	    for (int i = 0; i < matrix.length; i++) {
	    	for (int j = 0; j < matrix[i].length; j++) {
	    		matrix[i][j] = (Math.random() * 100);
	    	}
	    }
	    System.out.println("Matrix: ");
	    for (double[] a: matrix) {
			for (double e: a) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	    System.out.println("Sum of Major Diagonal: ");
	    System.out.print(sumMajorDiagonal(matrix));
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (i == j) {
					sum+= m[i][j];
				}
			}
		}
		return sum;
	}

}
