package main;

public class ProblemTwo {

	/**
	 *  Project Euler, Problem 2
	 *  Sum of even numbers in a fibonacci sequence
	 *  Scott Gilmour
	 */
	public static void main(String[] args) {
		System.out.println(sumOfEvenNumbersFibonacci(4000000));
	}
	
	/**
	 * @param cap : Int to stop sequencing at
	 * @return sum : The sum of even numbers throughout the sequence
	 */
	public static int sumOfEvenNumbersFibonacci(int cap) {
		int sum = 0, k = 2, n = 0, i = 0;
		
		while (i <= cap) {
			sum += i;
			
			i = 4 * k + n;
			n = k;
			k = i;
		}
		
		return sum;
	}

}
