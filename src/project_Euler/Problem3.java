package project_Euler;

public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num = 600851475143L;
		
		System.out.println(p3(num));

	}
	/*
	 * return the largest prime factor of the integer num
	 */
	public static long p3(long num) {
		
		long k = 2;	
		long largestPrime = num;
		
		A: while(k < largestPrime) {
			
			while (largestPrime %k == 0) {
				//if largest prime has multiplicity > 1 in the prime factorization
				if(largestPrime == k) {
					break A;
				}else {
					largestPrime = largestPrime/k;
				}
				
			}
			
			if(k==2) {
				k+=1;
			}else {
				k+=2;
			}
		}
		
		return largestPrime;
	}

}
