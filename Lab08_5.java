import java.util.Scanner;
public class Lab08_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 9;
		System.out.print("Enter the status as the decimal number (0 - " + ((int)(Math.pow(2, n) - 1)) + "): ");
		int dec = input.nextInt();
		int[] bin = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			bin[i] = dec % 2;
			dec /= 2;
		}
		for (int e: bin) {
			System.out.print(e + " ");
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print((bin[i] == 0 ? 'H' : 'T') + ((i + 1) % 3 == 0 ? "\n" : " "));
		}
		input.close();
	}
}
