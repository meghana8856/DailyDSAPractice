package DSADailyPractice;


//Count ways to obtain given sum by repeated throws of a dice
/*Given an integer N, the task is to find the number of ways to get the sum N by repeatedly throwing a dice.



findWays(N) = findWays(N – 1) + findWays(N – 2) + findWays(N – 3) + findWays(N – 4) + findWays(N – 5) + findWays(N – 6)
Examples:

Input: N = 3
Output: 4
Explanation:
The four possible ways to obtain N are:


1 + 1 + 1
1 + 2
2 + 1
3*/

import java.util.Arrays;

public class waysToGetSumByThrowingDice {
	public static void main(String[] args) {
      int n=3;
      int ans=findWays(n);
      
		System.out.println(ans);
		}
	
	static int findWays(int n) {
		
		
		if(n==0) {return 1;}
		int cnt=0;
		for(int i=1;i<=6;i++) {
			if(n-i>=0) {
			cnt=cnt+findWays(n-i);	
			}
		}
		return cnt;
	}

	
}
