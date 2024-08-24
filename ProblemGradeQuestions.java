
public class ProblemGradeQuestions {

	public static void main(String[] args) {
		// 10 questions keys
		char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'}; 
		// 8 students answer sheet
		char[][] answers = {
		{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
		{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
		{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
		{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
		{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
		};
		for (int i = 0; i < answers.length; i++) {
			int count = 0;
			for (int j = 0; j < answers[i].length; j++) {
				if (keys[j] == answers[i][j]) {
					count++;	
				}
			}
			System.out.println("Student" + i + "'s correct counts: " + count);
		}
	}
}