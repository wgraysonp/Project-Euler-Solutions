package project_Euler;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * return the difference between the square of the 
		 * first 100 natural numbers and the sum of the 
		 * squares
		 */
		
		int diff = 0;
		
		for (int i = 1; i <=100; i++) {
			for (int j = 1; j<=100; j++) {
				if(i != j) {
					diff += i*j;
				}
			}
		}
		
		System.out.println(diff);
		
	}

}
