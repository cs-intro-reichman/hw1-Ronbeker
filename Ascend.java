// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		int first = (int) (Math.random() * limit);
		int second = (int) (Math.random() * limit);
		int third = (int) (Math.random() * limit);
		int sum = first + second + third;
		int max = Math.max(Math.max(first,second),third);
		int min = Math.min(Math.min(first,second),third);
		int middle = sum - max - min;
		System.out.println(first + " " + second + " " + third);
		System.out.println(min + " " + middle + " " + max);
	}
}
