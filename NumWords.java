// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	// Insert random number between 0 to 999
	int number = Integer.parseInt(args[0]);
	
	int ones= number % 10;  
	int tens = (number/10)%10; 
	int hundreds = (number/100)%10;

	if (number>999){
		hundreds = number/ 100; 
	}

	System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");

	}
}