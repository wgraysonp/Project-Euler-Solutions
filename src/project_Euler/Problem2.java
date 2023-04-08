package project_Euler;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(p2(4000000));
	}
	/*
	 * Find the sum of all even terms of the fibonacci sequence
	 * less than or equal to maxNum
	 */
	public static int p2(int maxNum) {
		
		//the first term of the Fibonacci sequence is odd
		if (maxNum < 2) {
			return 0;
		}
		
		//if maxNum >=2 start the summmation from 2
		int sum = 2;
		int prevfibNum = 2; //stores the a_{n-1} term in the sequence
		int prev2fibNum = 1; //stores the a_{n-2} term in the sequence
		int currfibNum;//stores the a_n term in the sequence
		
		while(true) {
			currfibNum = prevfibNum + prev2fibNum;
			
			//check if the next term in the sequence is larger than the maximum number
			if(currfibNum > maxNum) {
				break;
			//check if the next term is even, if so add to sum
			} else if(currfibNum%2==0) {
				sum+=currfibNum;
			}
			
			//update the terms of the sequence to calculate the next term
			prev2fibNum = prevfibNum;
			prevfibNum = currfibNum;
		}
		
		return sum;
	}

}
