package DSADailyPractice;

import java.util.Arrays;

//check leetcode for both iterative and recursive code under submissions

public class DungeonPriness {
	public static void main(String[] args) {
		int[][] mat = { { -2, -3, 3 }, { -5, -10, 1 }, { 10, 30, -5 } };
		  int m = mat.length - 1;
	        int n = mat[0].length - 1;
	        
	        int[][] dp = new int[m+1][n+1];
	        
	        for(int[] temp:dp) {
	        	Arrays.fill(temp, -1);
	        }
	        
//	        if (mat[m - 1][n - 1] < 0) {
//	            dp[m - 1][n - 1] = -mat[m - 1][n - 1] + 1;
//	        } else {
//	            dp[m - 1][n - 1] = 1;  
//	        }
//	        
//	        for (int j = n - 2; j >= 0; j--) {
//	            int x = dp[m - 1][j + 1] - mat[m - 1][j];
//	            dp[m - 1][j] = Math.max(x, 1);  
//	        }
//	        
//	        for (int i = m - 2; i >= 0; i--) {
//	            int x = dp[i + 1][n - 1] - mat[i][n - 1];
//	            dp[i][n - 1] = Math.max(x, 1); 
//	        }
//	        
//	        for (int i = m - 2; i >= 0; i--) {
//	            for (int j = n - 2; j >= 0; j--) {
//	                int x = Math.min(dp[i + 1][j], dp[i][j + 1]) - mat[i][j];
//	                dp[i][j] = Math.max(x, 1); 
//	            }
//	        }
	        
	        System.out.println(dungeonpri(mat,m,n,dp));
	}
	
	 static int dungeonpri(int[][] mat, int m, int n, int[][] dp) {
		    int rows = mat.length;
		    int cols = mat[0].length;

		    if (m == rows - 1 && n == cols - 1) {
		        return mat[m][n] < 0 ? -mat[m][n] + 1 : 1;
		    }

		    if (dp[m][n] != -1) {
		        return dp[m][n];
		    }

		    int minHealth = Integer.MAX_VALUE;

		    if (m + 1 < rows) {
		        minHealth = Math.min(minHealth, dungeonpri(mat, m + 1, n, dp));
		    }

		    if (n + 1 < cols) {
		        minHealth = Math.min(minHealth, dungeonpri(mat, m, n + 1, dp));
		    }

		    int result = minHealth - mat[m][n];

		    dp[m][n] = result <= 0 ? 1 : result;
		    return dp[m][n];
		}
}
