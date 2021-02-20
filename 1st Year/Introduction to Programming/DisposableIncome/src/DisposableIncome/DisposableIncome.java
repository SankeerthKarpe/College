package DisposableIncome;  

import java.util.Scanner;  

public class DisposableIncome {
	public static final double TAX = 0.35;

	public static void main(String[] args) {
		/*Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 10:10   
       Comment: I used a constant instead of number
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5: 5  
       Comment: I used a meaningful constant name
    3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5:5  
       Comment: I did format the constant in UPPERCASE
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10:10  
       Comment: I did use easy-to-understand meaningful variable name
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 10:10  
       Comment: I did format the variable names properly
   6. Did I indent the code appropriately?
       Mark out of 10:10  
       Comment: I did indent the code appropriately
   7. Did I read the input correctly from the user using appropriate question(s)?
       Mark out of 10:10  
       Comment: I did input correctly from the user using appropriate question
   8. Did I compute the disposable income correctly?
       Mark out of 10:10  
       Comment: Yeah I did compute the disposable income correctly
   9. Did I compute the disposable income percentage correctly?
       Mark out of 10:10  
       Comment: Yeah I did compute the disposable income percentage correctly
   10. Did I output the correct answer in the correct format (as shown in the examples)?
       Mark out of 10:10  
       Comment: Yeah I did output the correct answer in the correct format
   11. How well did I complete this self-assessment?
       Mark out of 10:10  
       Comment: I completed the self-assessment really well
   Total Mark out of 100 (Add all the previous marks): 100 */
		System.out.println(" How much are you paid a month before tax? ");
		Scanner input = new Scanner(System.in);
		double income = input.nextDouble();
		System.out.println(" How much do you pay in rent/mortgage a month? ");
		double accomodationCost = input.nextDouble();
		System.out.println( "How much does your commute cost a month? ");
		double travel = input.nextDouble();
		System.out.println(" How much do you spend on food per month? ");
		double food = input.nextDouble();
		double afterTaxIncome = (income - (income*TAX));
		double disposableIncome = afterTaxIncome - accomodationCost -travel -food;
		long percentage = Math.round((disposableIncome / income) * 100);
		System.out.println(" Your monthly disposable income is €" + disposableIncome + " which is " + percentage + "% of your salary.");
		

	}

}

  
   
  

  
   
  