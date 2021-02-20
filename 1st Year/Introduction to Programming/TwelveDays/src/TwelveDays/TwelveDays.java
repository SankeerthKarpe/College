package TwelveDays;

/* SELF ASSESSMENT 
1. Did I use appropriate CONSTANTS instead of numbers within the code? 
    Mark out of 5: 5
    comment: I have used appropriate CONSTANTS instead of numbers within the code
2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE? 
    Mark out of 5:5 
    comment: I used easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE
3. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)? 
    Mark out of 10: 10
    comment: I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)
4. Did I indent the code appropriately? 
    Mark out of 10: 10
    comment: I have indented the code appropriately
5. Did I use an appropriate loop (or loops) to produce the different verses? 
    Mark out of 20: 20
    comment: I have used an appropriate loop (or loops) to produce the different verses
6. Did I use a switch to build up the verses? 
    Mark out of 25: 25
    comment: I used a switch to build up the verses 
7. Did I avoid duplication of code and of the lines which make up the verses (each line should be referred to in the code only once (or twice))? 
    Mark out of 10:10
    comment: I avoided duplication of code and of the lines which make up the verses 
8. Does the program produce the correct output? 
    Mark out of 10: 10
    comment: The program gives the correct output 
9. How well did I complete this self-assessment? 
    Mark out of 5:5
    comment: I have completed the self assignment honestly as I can
Total Mark out of 100 (Add all the previous marks):100 
*/

public class TwelveDays {
	
	public static final String FIRST = "first";
	public static final String SECOND = "second";
	public static final String THIRD = "third";
	public static final String FOURTH = "fourth";
	public static final String FIFTH = "fifth";
	public static final String SIXTH = "sixth";
	public static final String SEVENTH = "seventh";
	public static final String EIGHT = "eight";
	public static final String NINTH = "ninth";
	public static final String TENTH = "tenth";
	public static final String ELEVENTH = "eleventh";
	public static final String TWELFTH = "twelfth";
	
	public static void main(String[]args) {
		
		String day = "";
		int count;
		for (count = 1; count<13; count++) {
			
			System.out.print("\n");
			
			if (count == 1) {
				day = FIRST;
			}
			else if (count == 2) {
				day = SECOND;
			}
			else if (count == 3) {
				day = THIRD;
			}
			else if (count == 4) {
				day = FOURTH;
			}
			else if (count == 5) {
				day = FIFTH;
			}
			else if (count == 6) {
				day = SIXTH;
			}
			else if (count == 7) {
				day = SEVENTH;
			}
			else if (count == 8) {
				day = EIGHT;
			}
			else if (count == 9) {
				day = NINTH;
			}
			else if (count == 10) {
				day = TENTH;
			}
			else if (count == 11) {
				day = ELEVENTH;
			}
			else if (count == 12) {
				day = TWELFTH;
			}
			
			System.out.println("On the "+ day +"day of christmas, my true love gave to me.");
			
			 switch (count)
	            {
	                case 12:
	                    System.out.println("12 Drummers Drumming,\n");
	                case 11:
	                    System.out.println("11 Pipers Piping,\n ");
	                case 10:
	                    System.out.println("10 Lords a Leaping,\n ");
	                case 9:
	                    System.out.println("9 Ladies Dancing,\n ");
	                case 8:
	                    System.out.println("8 Maids a Milking,\n ");
	                case 7:
	                    System.out.println("7 Swans a Swimming,\n ");
	                case 6:
	                    System.out.println("6 Geese a Laying,\n ");
	                case 5:
	                    System.out.println("5 Golden Rings,\n ");
	                case 4:
	                    System.out.println("4 Calling Birds,\n ");
	                case 3:
	                    System.out.println("3 French Hens,\n ");
	                case 2:
	                    System.out.println("2 Turtle Doves,\n ");
	                case 1:
	                    System.out.println("A Partridge in a Pear Tree \n");
	                    break;
	                default:
	                    break;
	            }

	        }

	    }

	

		}
	
		
	