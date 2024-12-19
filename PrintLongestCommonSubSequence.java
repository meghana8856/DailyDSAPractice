package DSADailyPractice;

import java.util.Arrays;

public class PrintLongestCommonSubSequence {
	public static void main(String[] args) {
		String s1="adebc";
		String s2="dcadb";
		  int dp[][]=new int[s1.length()][s2.length()];
		  for(int[] i: dp){
		      Arrays.fill(i,-1);
		  }
	int ans = lcs(s1,s2,s1.length()-1,s2.length()-1,dp);
	
	// for longest palindromic subsequence
//		  StringBuilder str=new StringBuilder(s1);
//		  s2 =str.reverse().toString();
//		  System.out.println(s2);
//	int ans = lcs(s1,s2,s1.length()-1,s2.length()-1,dp);

	System.out.println(ans);
	}
	
	//in same code toacheiev longest palindromic subsequence reverse string s1==> s2=s1.reverse

private static int lcs(String s1, String s2,int i,int j,int[][] dp) {
		
		if(i<0 || j<0) {
			return 0;
		}

        if(dp[i][j]!=-1){
            return dp[i][j];
        }
		
		if(s1.charAt(i)==s2.charAt(j)) {
            dp[i][j]=1+lcs(s1,s2,i-1,j-1,dp);
			return dp[i][j];
		} else {
            dp[i][j]=Math.max(lcs(s1,s2,i,j-1,dp),lcs(s1,s2,i-1,j,dp));
			return dp[i][j];
		}
	}
}
