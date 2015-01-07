public class EvenFibonacci {

	public static void main(String[] args) {
		int first = 1;
		int second = 1;
		
		int third = 0;
		int sumOfEven = 0;
		
		while (third < 4000000){
			if (third % 2 == 0)
				sumOfEven += third;
			third = first + second;
			first = second;
			second = third;
		}
		
		System.out.println("The sum of even numbers in the fibonacci sequence is: " + sumOfEven);
	}

}
