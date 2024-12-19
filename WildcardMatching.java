package DSADailyPractice;
/*
Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).

 

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".*/

import java.util.Arrays;

public class WildcardMatching {
	public static void main(String[] args) {
		String s1 = "zacabz";
		String s2 = "*a?b*";
		int dp[][] = new int[s1.length()][s2.length()];
		for (int[] i : dp) {
			Arrays.fill(i, -1);
		}
		boolean ans = wilcard(s1, s2, s1.length() - 1, s2.length() - 1,dp);

		System.out.println(ans);
	}

    private static boolean wilcard(String s1, String s2, int i, int j,int[][] dp) {
        if (i < 0 && j < 0) {
            return true;
        }
        if (i < 0) {
            for (int k = 0; k <= j; k++) {
                if (s2.charAt(k) != '*') {
                    return false;
                }
            }
            return true;
        }
        if (j < 0) {
            return false;
        }

        if(dp[i][j]!=-1){
            return dp[i][j]==1;
        }

        if ((s1.charAt(i) == s2.charAt(j)) || (s2.charAt(j) == '?')) {
             dp[i][j] = wilcard(s1, s2, i - 1, j - 1,dp) ? 1 : 0;
             return dp[i][j]==1;
        }
        if (s2.charAt(j) == '*') {
            dp[i][j]= (wilcard(s1, s2, i - 1, j,dp) || wilcard(s1, s2, i, j - 1,dp)) ? 1 : 0;
            return dp[i][j]==1;
        }

        return false;
    }
}
