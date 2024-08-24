public class Lab08_2 {

	public static void main(String[] args) {
		int employees = 7;
		int days = 7;
		int[][] workHours = new int[employees][days];
	    for (int i = 0; i < workHours.length; i++) {
	    	for (int j = 0; j < workHours[i].length; j++) {
	    		workHours[i][j] = (int)(Math.random() * 10);
	    	}
	    }
		int[][] totalHours = new int[workHours.length][2];
		for (int i = 0; i < workHours.length; i++) {
			int sum = 0;
			for (int e: workHours[i]) {
				sum += e;
			}
			totalHours[i][0] = i;
			totalHours[i][1] = sum;
		}
		for (int[] a: workHours) {
			for (int e: a) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
		sortMat(totalHours);
		System.out.println();
		for (int[] a: totalHours) {
			for (int e: a) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
	}
	
	public static void sortMat(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			int max = m[i][1];
			int idxMax = 0;
			
			for (int j = i + 1; j < m.length; j++) {
				if (m[j][1] > max) {
					max = m[j][1];
					idxMax = j;
				}
			}
			
			if (i != idxMax && idxMax != 0){
				int tempId = m[i][0];
				m[i][0] = m[idxMax][0];
				m[idxMax][0] = tempId;
				
				int temp = m[i][1];
				m[i][1] = m[idxMax][1];
				m[idxMax][1] = temp;
			}
		}
	}
}