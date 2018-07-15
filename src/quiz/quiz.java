package quiz;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		
		int score = 0; 
					
		// first question
		System.out.print("1. How much is 2 + 2? ");
		System.out.print("\n");
		
		// scanner answer
		String a1 = scanner.next();
			if (a1.equals("4")) {
				System.out.print("Good answer!");
				score++;
				System.out.print("\n");
			} else {System.out.print("Wrong answer.");
				score--;
				System.out.print("\n");
			}
		// second question
		System.out.print("2. So how much is 2 + 2 + 2? ");
		System.out.print("\n");
		
		// scanner answer
		String a2 = scanner.next();
			if (a2.equals("6")) {
				System.out.print("Good answer!");
				score++;
				System.out.print("\n");
			} else {System.out.print("Wrong answer.");
				score--;
				System.out.print("\n");
			}
		
		// your score is
			System.out.print("Your score is " + score);
			System.out.print("\n");
	
			scanner.close();


}
}
