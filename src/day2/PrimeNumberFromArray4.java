package day2;
//ctrl shift o  to remove unwanted imports
public class PrimeNumberFromArray4 {

	public static void main(String[] args) {
		 
		int[] numbers = {1, 5, 7, 9, 11, 19, 23, 97, 53};
		int[] primes = new int[numbers.length];
		
		int index = 0;
		 
		for (int i = 0; i < numbers.length; i++) 
		{
			if (checkPrime(numbers[i])) 
				{
				primes[index++] = numbers[i];
				}
		}
	}
	
	private static boolean checkPrime(int n1) {
		int counter = 0;
		for (int i = 1; i <= n1; i++) 
			if (n1 % i == 0) 	
				counter++;

		return counter==2? true:false;
	}
}
