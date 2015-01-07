public class SumOfMultiples {

	public static void main(String[] args) {
		int sum = 0;
		for (int i=1; i< BOUNDARY; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}

		System.out.println("The sum of the multiples is: " + sum);
	}

	final static int BOUNDARY = 1000; 
}
