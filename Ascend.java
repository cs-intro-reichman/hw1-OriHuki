// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// INPUT A RANDOM LIM 
		int lim = Integer.parseInt(args[0]);
		
		if (lim>0 && lim <=100) {
			// GET 3 RANDOM NUMBERS LESS THAN LIM 
			int a = (int)(Math.random() * lim); 
			int b = (int)(Math.random() * lim); 
			int c = (int)(Math.random() * lim); 
			
			//PRINT 3 RANDOM NUMBERS A,B,C 
			System.out.println(a + " " + b + " " +c );

            //SORT WHICH IS MAX, MIN, MIDDLE 
			int max = Math.max(Math.max(a, b), c); 
			int min = Math.min(Math.min(a, b), c); 
			int middle= (a+b+c) - (max + min); 

			System.out.println(min + " " + middle + " " + max); 
		}

		else{
			System.out.println("You inserted wrong number");}

	}
}
