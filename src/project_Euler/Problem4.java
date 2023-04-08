package project_Euler;



public class Problem4 {

	public static void main(String[] args) {
		
		System.out.println(findMaxPalindrome());

	}
	
	public static int findMaxPalindrome() {
		int maxPalindrome = 0;
		
		for (int i = 999; i >= 100; i--) {
			for (int j=999; j>=100; j--) {
				if ((i*j > maxPalindrome) && (isPalindrome(i*j))) {
					maxPalindrome = i*j;
				}
			}
		}
		
		return maxPalindrome;
		
	}
		
		
	
	public static boolean isPalindrome(int x) {
		char[] st = Integer.toString(x).toCharArray();
		int n = st.length;
		char temp;
		
		for (int i = 0; i <= n/2-1; i++) {
			 temp = st[i];
			 st[i] = st[n - i - 1];
			 st[n - i - 1] = temp;	
		}
		
		return Integer.toString(x).equals(new String(st));
		
		
	}
	/*
	 * Check if integer y can be written as product of two x-digit numbers
	 */

}
