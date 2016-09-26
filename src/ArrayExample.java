import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Tyler's Jagged Array Builder!");
		System.out.print("How many rows would you like in your array?");

		// Value of input is equal to the number of rows to be created(user Input).
		int input = sc.nextInt();
		// This line is to declare a variable that will be updated by user input
		String theWordYouInput;
		// The second bracket is left empty since we don't know how many columns
		// are in each row. We'll ask that later on FOR EACH row.
		String[][] wordsArray = new String[input][];
		// for loop FOR EACH row in the array words
		for (int i = 0; i < wordsArray.length; i++) {
			System.out.print("How many columns in row number " + (i + 1) + ":");//i+1 used to account for the value the user expects.
			input = sc.nextInt();//number of columns
			// used to clear the the new character from pressing enter
			sc.nextLine();
			//New String array created for each index of wordsArray
			wordsArray[i] = new String[input];
			// for loop FOR EACH column in the array called wordsArray at row-position i,
			// Store a user's word.
			for (int j = 0; j < wordsArray[i].length; j++) {
				//
				System.out.println("What word would you like in position[" + i + "] [" + j + "]");
				// store input into variable
				theWordYouInput = sc.nextLine();
				// store variable into the array.
				wordsArray[i][j] = theWordYouInput;
			}

		}

		// For loop to print out each element in the 2d array
		System.out.println("Here is your array!");
		for (int x = 0; x < wordsArray.length; x++) {

			for (int y = 0; y < wordsArray[x].length; y++) {
				System.out.print(wordsArray[x][y] + "\t");
			}
			System.out.println();

		}

		// Ending prompt
		System.out.println("Thanks for Building an Array with me! \n Would you like to play again?(y or n)");

		sc.close();
	}

}
