
public class Lab08_3 {
	
	public static void main(String[] args) {
		double[][] m1 = {{6, 7, 3}, {9, 5, 1}, {2, 8, 4}};
		double[][] m2 = {{1.6, 9.8, 3.2}, {4, 5.7, 1}, {2.8, 7.8, 6}};
	    System.out.println("Matrix 1: ");
		for (double[] a: m1) {
			for (double e: a) {
				System.out.printf("%8.1f", e);
			}
			System.out.println();
		}
	    System.out.println("Matrix 2: ");
		for (double[] a: m2) {
			for (double e: a) {
				System.out.printf("%8.1f", e);
			}
			System.out.println();
		}
		System.out.println("Multiply a by b: ");
		printMat(multiplyMatrix(m1, m2));
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b){
		double[][] result = new double[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				for (int k = 0; k < a[i].length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return result;
	}
	
	public static void printMat(double[][] m) {
		for (double[] arr: m) {
			for (double e: arr) {
				System.out.printf("%8.1f", e);
			}
			System.out.println();
		}
		System.out.println();
	}
}