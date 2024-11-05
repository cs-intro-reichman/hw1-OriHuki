// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
    //Insert 4 args, 3 String, 1 Int. 
		String name1 = args[0];
        String name2 = args[1]; 
        String name3 = args[2]; 
        int value = Integer.parseInt(args[3]);
    //Calculate the avg price for each person and rounding it up.     
        double eachPrice= value/3.0;
        double newPrice= Math.ceil(eachPrice);
        System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": Pay " + newPrice +" Shekels each.");
       }
	}
