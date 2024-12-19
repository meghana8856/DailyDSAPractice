package DSADailyPractice;

public class StringInterleaving {
	public static void main(String[] args) {
	boolean ans = interleaving("abcs","xyz","abxycsz");
	System.out.println(ans);
	printInterLeaving("AB",0,"CD",0,"");
	}

	private static boolean interleaving(String a, String b, String c) {
		boolean dp[][][]=new boolean[a.length()+1][b.length()+1][c.length()+1];
		
		return interleavingHelper(a,a.length(),b,b.length(),c,c.length(),dp);
	}

	private static boolean interleavingHelper(String a, int i, String b, int j, String c, int k,boolean dp[][][]) {
		
		if(i==0 && j==0 && k==0) {
			return true;
		}
		if(k==0) {
			return false;
		}
		if(dp[i][j][k]!=false) {
			return dp[i][j][k];
		}
		
		if(i>0 && c.charAt(k-1)==a.charAt(i-1) && interleavingHelper(a, i-1, b, j, c, k-1,dp)){
			dp[i][j][k]=true;
			return true;
		}
			if(j>0 && c.charAt(k-1)==b.charAt(j-1) && interleavingHelper(a, i, b, j-1, c, k-1,dp)){
				dp[i][j][k]=true;
				return true;
		}
			return false;
	}

	static void printInterLeaving(String s1, int i, String s2, int j, String asf) {
		if (i == s1.length() && j == s2.length()) {
			System.out.println(asf);
		}

// Either we will start with string 1
		if (i < s1.length())
			printInterLeaving(s1, i + 1, s2, j, asf + s1.charAt(i));
// Or with string 2
		if (j < s2.length())
			printInterLeaving(s1, i, s2, j + 1, asf + s2.charAt(j));
	}
}
