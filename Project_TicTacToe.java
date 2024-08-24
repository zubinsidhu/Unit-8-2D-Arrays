import java.util.Scanner;
public class Project_TicTacToe {
	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Play Tic Tac Toe!"); 
		char[][] board = new char[3][3];
		displayBoard(board);
		while (true) {
			makeMove(board, 'X'); 
			displayBoard(board);
			if (isWon('X', board)) {
				System.out.println("X is the winner!"); System.exit(1);
			}
			else if (isDraw(board)) {
				System.out.println("It is draw"); System.exit(2);
			}
			makeMove(board, 'O'); 
			displayBoard(board);
			if (isWon('O', board)) {
				System.out.println("O is the winner!"); System.exit(1);
			}
			else if (isDraw(board)) {
				System.out.println("It is draw"); System.exit(2);
			}
		}
	}
	
	public static void displayBoard(char[][] b) {
		for (int r = 0; r < b.length; r++) {
			System.out.println("-------------");
			for (int c = 0; c < b.length; c++) {
				System.out.print(b[r][c] == '\u0000' ? "|   " : "| " + b[r][c] + " ");
			}
			System.out.println("|");
		}
		System.out.println("-------------");
	}

	public static void makeMove(char[][] b, char p) {
		boolean done = false;
		do {
			System.out.print("\nEnter row, column for Player " + p + ": ");
			int row = input.nextInt();
			int col = input.nextInt();
			if (b[row][col] == '\u0000') {
				b[row][col] = p;
				done = true;
			}
			else {
				System.out.print("The cell is already occupied. Try again."); 
			}
		} while (!done);
	}
	
	public static boolean isWon(char p, char[][] b) {
		
		//check if any of the rows are same
		for (int r = 0; r < b.length; r++) {
			boolean allSame = true;
			for (int c = 0; c < b.length; c++) {
				if (b[r][c] != p) {//compare to the first column element
					allSame = false;
					break;
				}
			}
			if (allSame) {
				System.out.println("Row " + r + " won by " + p);
				return true;
			}
		}
		
		//check if any of the columns are same
		for (int c = 0; c < b.length; c++) {
			boolean allSame = true;
			for (int r = 0; r < b.length; r++) {
				if (b[r][c] != p) {//compare to the first row element
					allSame = false;
					break;
				}
			}
			if (allSame) {
				System.out.println("Column " + c + " won by " + p);
				return true;
			}
		}
		boolean allSame = true;
		
		//check if diag 1 is same
		for (int r = 0; r < b.length; r++) {
			if (b[r][r] != p) {
				allSame = false;
				break;
			}
		}
		if(allSame) {
			System.out.println("Diag1 won by " + p);
			return true;
		}
		
		//check if diag 2 is same
		allSame=true;
		for (int r = 0; r < b.length; r++) {
			if (b[r][b.length-1-r] != p) {
				allSame = false;
				break;
			}
		}
		if(allSame) {
			System.out.println("Diag2 won by " + p);
			return true;
		}
		
		
		return false;
	}
	
	public static boolean isDraw(char[][] b) {
		for (int r = 0; r < b.length; r++) {
			for (int c = 0; c < b.length; c++) {
				if (b[r][c] == '\u0000') {
					return false;
				}
			} 
		}
		return true;
	}
}