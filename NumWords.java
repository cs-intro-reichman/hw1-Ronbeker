// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int originalNum = Integer.parseInt(args[0]);
	    int units = originalNum % 10;
	    int tens = (originalNum / 10) % 10;
	    int hundreds = (originalNum/ 100);
	    System.out.println(hundreds + " hundreds, " + tens + " tens, and " + units  + " ones.");
	}
}
