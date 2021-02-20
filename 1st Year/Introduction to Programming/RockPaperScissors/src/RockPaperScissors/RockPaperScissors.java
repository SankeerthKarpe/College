package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	
	public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;

	public static void main(String[] args) {
		  Random random = new Random();
	      Scanner scanner = new Scanner(System.in);
	      
	      int w=0; 
	      int l=0;
	      int count;
	      
	      int userChoice;
	      int computerChoice; 
	      
	      
          for(count=0; count<5; count++) {
	      System.out.println("Enter 1 (for Rock) or 2 (for Paper) or 3 (for Scissors):" +count);
	      userChoice = scanner.nextInt();
	      
	      if (userChoice < 1 || userChoice > 3)
	      {
	    	  System.out.println("Invalid number chosen");
	    	 
	      }
	      computerChoice = random.nextInt(3) + 1;
	      
	   
	      if (userChoice == ROCK)
	      {
	    	  if(computerChoice == SCISSORS)
	    	  {
	    		  System.out.println("You won this round as I chose Scissors");
	    		  w=w+1;
	    	  }
	    	  else if(computerChoice == PAPER)
	    	  {
	    		  System.out.println("You lost this round as I chose Paper");
	    		  l=l+1;
	    	  }
	    	  else if(computerChoice == ROCK)
	    	  {
	    		  System.out.println("This round was a draw as I chose Rock too");
	    	  }
	       }
	      else if(userChoice == PAPER)
	      {
	    	  if(computerChoice == ROCK)
	    	  {
	    		  System.out.println("You won this round as I chose Rock");
	    		  w=w+1;
	    	  }
	    	  else if(computerChoice == SCISSORS)
	    	  {
	    		  System.out.println("You lost this round as I chose Scissors");
	    		  l=l+1;
	    	  }
	    	  else if(computerChoice == PAPER)
	    	  {
	    		  System.out.println("This round was a draw as I chose Paper too");
	    	  }
	       }
	      else if (userChoice == SCISSORS)
	      {
	    	  if(computerChoice == ROCK)
	    	  {
	    		  System.out.println("You lost this round as I chose Rock");
	    		  l=l+1;
	    	  }
	    	  else if(computerChoice == PAPER)
	    	  {
	    		  System.out.println("You won this round as I chose Paper");
	    		  w=w+1;
	    	  }
	    	  else if(computerChoice == SCISSORS)
	    	  {
	    		  System.out.println("This round was a draw as I chose Scissors too");
	    	  }
	      
	     } 
		
		      
	      
	      System.out.println("The final score was Computer:" +l+ " User: " +w);
	      
		  }
		 
	}

	}


