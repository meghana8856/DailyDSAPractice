package DSADailyPractice;


public class LengthofLongestPalindromicSubsequence {
	public static void main(String[] args) {
		String st="BBABCBCAB";
	int ans = palindromicsub(st,0,st.length()-1);
	System.out.println(ans);
	}

	private static int palindromicsub(String st,int i,int j) {
		
		if(i>j) {
			return 0;
		}
		if(i==j) {
			return 1;
		}
		
		if(st.charAt(i)==st.charAt(j)) {
			return 2 + palindromicsub(st,i+1,j-1);
		}
		return Math.max(palindromicsub(st,i+1,j), palindromicsub(st,i,j-1));
		}
}
