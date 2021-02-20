package HiLoCardGame;

import java.util.Random;
import java.util.Scanner;

public class HiLoCardGame {
	public static final int ACE = 1;
	public static final int JACK = 11;
	public static final int QUEEN = 12;
	public static final int KING = 13;
	public static final int CORRECT = 4;
	public static final int HIGHEST = 13;
	
	/* SELF ASSESSMENT
	   1. Did I use appropriate CONSTANTS instead of numbers within the code?
	       Mark out of 5:5
	       Comment: I did use appropriate CONSTANTS instead of numbers within the code
	   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE?
	       Mark out of 5:5
	       Comment: I did use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE
	   3. Did I use easy-to-understand meaningful variable names?
	       Mark out of 10:10
	       Comment: I did use easy-to-understand meaningful variable names
	   4. Did I easy-to-understand meaningful variable names?
	       Mark out of 5:5
	       Comment: I did easy-to-understand meaningful variable names
	   5. Did I indent the code appropriately?
	       Mark out of 10:10
	       Comment: I did indent the code appropriately
	   6. Did I use an appropriate loop to allow the user to enter their guesses until they win or lose?
	       Mark out of 20:20
	       Comment: I did use an appropriate loop to allow the user to enter their guesses until they win or lose
	   7. Did I check the input to ensure that invalid input was handled appropriately?
	       Mark out of 10:10
	       Comment: I did check the input to ensure that invalid input was handled appropriately
	   8. Did I generate the cards properly using random number generation (assuming all cards are equally likely each time)?
	       Mark out of 10:10
	       Comment: I did generate the cards properly using random number generation
	   9. Did I output the cards correctly as 2, 3, 4, ... 9, 10, Jack, Queen, King?
	       Mark out of 10:10
	       Comment: I did output the card correctly as 2, 3, 4,...9, 10, Jack, Queen, King
	   10. Did I report whether the user won or lost the game before the program finished?
	       Mark out of 10:10
	       Comment: I did report the user whether he won or lost before the program finished
	   11. How well did I complete this self-assessment?
	       Mark out of 5:5
	       Comment:  I completed this self assessment as honestly as I can
	   Total Mark out of 100 (Add all the previous marks):100
	*/

	// TODO Auto-generated method stub
    public static void main(String args[]) {
    	int correct = 0;
    	while (correct < CORRECT) {
        Random  generator = new Random();
        int card = generator.nextInt(HIGHEST) +1;
        int nextCard = generator.nextInt(HIGHEST) +1;
        Scanner input = new Scanner( System.in );
        if(card == ACE) {
        	System.out.println("\n\nThe card is a Ace" + "\nDo you think the next card will be higher, lower or equal?");
        }
        else if(card == JACK) {
        	System.out.println("\n\nThe card is a Jack" + "\nDo you think the next card will be higher, lower or equal?");
        }
        else if(card == QUEEN) {
        	System.out.println("\n\nThe card is a Queen" + "\nDo you think the next card will be higher, lower or equal?");
        }
        else if(card == KING) {
        	System.out.println("\n\nThe card is a King" + "\nDo you think the next card will be higher, lower or equal?");
        }
        else {
        	System.out.println("\n\nThe next card is a " + card + "\nDo you think the next card will be higher, lower or equal?");
        }
        if(nextCard > card && input.hasNext("higher")) {
        	correct++;
        	System.out.println("Correct");
        	System.out.print("The card was " + nextCard);
        }
        else if(nextCard < card && input.hasNext("higher")) {
        	correct = 0;
        	System.out.println("Wrong");
        	System.out.print("The card was " + nextCard);
        }
        else if(nextCard < card && input.hasNext("lower")) {
        	correct++;
        	System.out.println("Correct");
        	System.out.print("The card was " + nextCard);
        }
        else if(nextCard > card && input.hasNext("lower")) {
        	correct = 0;
        	System.out.println("Wrong");
        	System.out.print("The card was " + nextCard);
        }
        else if(nextCard < card && input.hasNext("higher")) {
        	correct = 0;
        	System.out.println("Wrong");
        	System.out.print("The card was " + nextCard);
        }
        else if(nextCard == card && input.hasNext("equal")) {
        	correct++;
        	System.out.println("Correct");
        	System.out.print("The card was " + nextCard);
        }
        else if(nextCard != card && input.hasNext("equal")) {
        	correct = 0;
        	System.out.println("Wrong");
        	System.out.print("The card was " + nextCard);
        }
        if (!input.hasNext("equal") && !input.hasNext("higher") && !input.hasNext("lower")) {
        	System.out.println("ERROR");
        }
    }
    	if (correct == 4) {
    		System.out.println("\n\nCongratulations.  You got them all correct.");
    	}
}
}