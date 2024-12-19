package DSADailyPractice;

import java.util.Arrays;

//Given a M x N grid A of integers, find a path from top left to bottom right which      minimizes the sum of all numbers along its path.
//Return the minimum sum of the path.

public class MinimumPathSumInMatrix {
	public static void main(String[] args) {
		int[][] mat = { { 1,3,1 }, { 1,5,1 }, { 4,2,1 } };
		   int dp[][] = new int[mat.length][mat[0].length];
	        for(int[] temp:dp){
	            Arrays.fill(temp,-1);
	        }
	        System.out.println( minPath(mat, 0, 0,dp));
	    }

	    static int minPath(int[][] mat, int m, int n,int[][] dp) {
	        if (m == mat.length - 1 && n == mat[0].length - 1) {
	            dp[m][n]= mat[m][n];
	            return dp[m][n];
	        }
	        if (m >= mat.length || n >= mat[0].length) {
	            return Integer.MAX_VALUE;
	        }
	        if(dp[m][n]!=-1){
	            return dp[m][n];
	        }
           
	        dp[m][n]=Math.min(minPath(mat, m + 1, n,dp),  minPath(mat, m, n + 1,dp))+mat[m][n];
	        return dp[m][n];
	    }
}
