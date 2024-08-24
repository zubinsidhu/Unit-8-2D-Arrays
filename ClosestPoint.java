
public class ClosestPoint {

	public static void main(String[] args) {
		double[][] points = {{-1, 3}, {-1, -1}, {1, 1}, {2, 0.5}, {2, -1}, {3, 3}, {4, 2}, {4, -0.5}};
		double minDist = distance(points[0][0], points[0][1], points[1][0], points[1][1]);
		int indexMinP1 = 0, indexMinP2 = 1;
		for (int i = 0; i < points.length; i++) {
			for (int j = i + 1; j < points.length; j++) { 
				double d = distance(points[i][0], points[i][1], points[j][0], points[j][1]); 
				if (d < minDist) {
		               minDist = d;
		               indexMinP1 = i;
		               indexMinP2 = j;
		        }
			}
		}
		System.out.println("The closest Pair: (" + points[indexMinP1][0] + ", " + points[indexMinP1][1] + ") and (" + points[indexMinP2][0] + ", " + points[indexMinP2][1] + ")");
	}
	
	public static double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}	
}