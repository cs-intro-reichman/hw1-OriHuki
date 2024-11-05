// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){

	// insert 3 inputs currentValue, n(year), rate(peryear) 
	int currentValue = Integer.parseInt(args[0]);
	double rate = Double.parseDouble(args[1]);
	int n = Integer.parseInt(args[2]);

	// 2 integers that will help me later 	
	double futureValue =0; 
	double newRate = rate/100; 

	if (currentValue>=0) {
		futureValue = (currentValue * Math.pow(newRate +1, n));
		System.out.println("After " + n + " years, $" + currentValue + " saved at " + rate +  "% will yield $" + (int)futureValue); }

	}
} 