import java.util.Scanner;
public class Sudoku {

	public static void main(String[] args) {
		int[][] grid = readSolution(); 
		System.out.println(isValid(grid) ? "Valid Solution" : "Invalid Solution");
	}
	
	public static int[][] readSolution() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sudoku puzzle solution: ");
		int[][] grid = new int[9][9];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++) 
				grid[i][j] = input.nextInt();
		input.close();
		return grid;
	}
	
	/** Check whether each element grid[i][j] is valid in the grid */
	public static boolean isValid(int i, int j, int[][] grid) {
	    for (int col = 0; col < 9; col++)
	    	if (col != j && grid[i][col] == grid[i][j]) return false;
	    for (int row = 0; row < 9; row++)
	    	if (row != i && grid[row][j] == grid[i][j]) return false; 
	    for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++)
	    	for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++)
	    		if (row != i && col != j && grid[row][col] == grid[i][j])
	               return false;
	    return true;
	}
	
	/** Check whether the solution is valid */
	public static boolean isValid(int[][] grid) {
	    for (int i = 0; i < 9; i++)
	    	for (int j = 0; j < 9; j++)
	    		if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid))
	               return false;
	    return true;
	}
}