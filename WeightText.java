import java.util.Scanner;

public class WeightText {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			String input;
			do {
				System.out.print("Enter text, END to finish: ");
				input = scanner.nextLine();

				if (!input.equals("END")) {
					int length = input.length();
					int weight = input.chars().sum();

					System.out.println("Length is " + length);
					System.out.println("Weight is " + weight);
				}

			} while (!input.equals("END"));
			
			System.out.print("Successful completion of program");

		} catch (Exception e) {
			System.out.println("Error.");
		} finally {
			
			scanner.close();
		}
	}

}
