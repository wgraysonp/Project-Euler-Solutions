package project_Euler;

public class Problem5 {

	public static void main(String[] args) {
		
		System.out.println(minDivisible(20));

	}
	
	public static int minDivisible(int y) {
		int i = y;
		while(!isDivisible(i, y)) {
			i++;
		}
		
		return i;
	}

	public static boolean isDivisible(int x, int y) {
		for(int i= 1; i <= y; i++) {
			if (x% i != 0) {
				return false;
			}
		}
		
		return true;
	}
}
