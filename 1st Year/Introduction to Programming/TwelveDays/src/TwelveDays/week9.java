package TwelveDays;

import java.util.Scanner;

/* SELF ASSESSMENT
1. Did I use easy-to-understand meaningfu,l properly formatted, variable names and CONSTANTS?
       Mark out of 10:10
       Comment:   I did use easy-to-understand meaningful properly formatted, variable names and CONSTANTS
2. Did I implement the getVerse function correctly and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
      Mark out of 25:25
       Comment:  I did implement the getVerse function correctly and in a manner that can be understood
3. Did I implement the getChristmasGift function correctly using a switch statement and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
      Mark out of 25:25
       Comment:   I did implement the getChristmasGift function correctly using a switch statement and in a manner that can be understood 
4. Did I implement the getOrdinalString function correctly using if or conditional operators and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
      Mark out of 25:25
       Comment:  I did implement the getOrdinalString function correctly using if or conditional operators and in a manner that can be understood
5. Does the program produce the output correctly?
      Mark out of 10:10
       Comment:  The program produces the output correctly
6. How well did I complete this self-assessment?
       Mark out of 5:5
       Comment:  I completed the self-assessment as honestly as I can
Total Mark out of 100 (Add all the previous marks):100
*/ 

public class week9 {
	
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
	
	public static String getVerse (int i)
	{
		String verse = "";
		
		System.out.print("\n\nOn the " + getOrdinalString(i) + " day of Christmas, my true love gave to me " + getChristmasGift(i));
		return verse;
	}
		

	
	public static String getOrdinalString (int count) 
	{
	
	String day = "";
	
		
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
	
	return day;
}
	

	public static String getChristmasGift (int num)
	{
		String gift = "";
		
		switch (num)
        {
            case 12:
                gift += ("\nTwelve Drummers Drumming,\n");
                
            case 11:
                gift += ("Eleven Pipers Piping,\n ");
                
            case 10:
                gift += ("Ten Lords a Leaping,\n ");
                
            case 9:
                gift += ("Nine Ladies Dancing,\n ");
                
            case 8:
                gift += ("Eight Maids a Milking,\n ");
                
            case 7:
                gift += ("Seven Swans a Swimming,\n ");
                
            case 6:
            	 gift += ("Six Geese a Laying,\n ");
                
            case 5:
            	 gift += ("Five Golden Rings,\n ");
                
            case 4:
            	 gift += ("Four Calling Birds,\n ");
                
            case 3:
            	 gift += ("Three French Hens,\n ");
                
            case 2:
            	 gift += ("Two Turtle Doves and A Partridge in a Pear Tree,\n ");
                break;
            case 1:
            	 gift += ("A Partridge in a Pear Tree \n");
                break;
        }
		return gift;
	}
	public static void main(String[] args) {
		
		for (int i = 1; i <13; i++)
		{
	System.out.print(getVerse(i));
	

}
		
	}
}
	

