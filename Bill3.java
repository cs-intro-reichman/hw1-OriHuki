// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
    // checking if the user insert 4 args 
    if (args.length==4) { 
    //Insert 4 args, 3 String, 1 Int. 
		String name1 = args[0];
        String name2 = args[1]; 
        String name3 = args[2]; 
        int value = Integer.parseInt(args[3]);
    //Calculate the avg price for each person and rounding it up.     
        double eachPrice= value/3.0;
        double newPrice= Math.ceil(eachPrice);
        System.out.println("Pay " + newPrice +" Shekels each.");}
		else if (args.length !=4) {
			System.out.println("You didnt insert args as requested"); }    
       }
	}
