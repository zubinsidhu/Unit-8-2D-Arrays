
public class TwoDArraysClasswork {

	public static void main(String[] args) {
		double[][] circles = new double[5][3];
		for (int i = 0; i < circles.length; i++) {
			for (int j = 0; j < circles[i].length; j++) {
				if (j < 3) circles[i][j] = Math.random() * 10;
				else circles[i][j] = Math.random() * 10 + 0.001;
			}
		}
		System.out.print("   Circles" + "\n--------------\n");
		for (double[] a: circles) {
			for (double e: a) {
				System.out.printf("%8.2f", e);
				System.out.println();
			}
		}
		System.out.println();
		double average = 0;
		for (int i = 0; i < circles.length; i++) {
			average += circles[i][2];
		}
		System.out.println("Average is: " + (average / 5));
	}
}