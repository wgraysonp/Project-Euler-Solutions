package project_Euler;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(p1());

	}

	public static String p1() {
		int sum = 0;
		
		for (int i = 1; i<1000; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum+=i;
			}
		}
		
		return Integer.toString(sum);
	}
}
