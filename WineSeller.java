package DSADailyPractice;

import java.util.Arrays;

/*Maximum profit from sale of wines
Given n wines in a row, with integers denoting the cost of each wine respectively. Each year you can sale the first or the last wine in a row. However, the price of wines increases over time. Let the initial profits from the wines be P1, P2, P3…Pn. In the Yth year, the profit from the ith wine will be Y*Pi. For each year, your task is to print “beg” or “end” denoting whether first or last wine should be sold. Also, calculate the maximum profit from all the wines.

Examples : 

Input: Price of wines: 2 4 6 2 5
Output: beg end end beg beg 
         64*/

public class WineSeller {
	public static void main(String[] args) {
		int[] arr={2 ,4 ,6, 2, 5};
        int[][] dp=new int[arr.length][arr.length];
        for(int[] i :dp) {
        	Arrays.fill(i, -1);
        }
        
		int ans = wineselling(arr,0,arr.length-1,1,dp);
		System.out.println(ans);
		}

		private static int  wineselling(int[] arr,int i ,int j,int y,int dp[][]) {
			if(i==j) {
				return y*arr[i];
			}
//		    if(i>j) return 0;
			
			if(dp[i][j]!=-1) {
				return dp[i][j];
			}

			 int left=y*arr[i] + wineselling(arr,i+1,j,y+1,dp);
			 int right=y*arr[j] + wineselling(arr,i,j-1,y+1,dp);
			
			 int max=Math.max(left, right);
			 dp[i][j]=max;
			return max;
		}

}
