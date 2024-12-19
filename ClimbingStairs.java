package DSADailyPractice;


//There are n stairs, and a person standing at the bottom wants to climb stairs to reach the top. The person can climb either 1 stair or 2 stairs at a time, the task is to count the number of ways that a person can reach at the top.
//
//Note: This problem is similar to Count ways to reach Nth stair (Order does not matter) with the only difference that in this problem, we count all distinct ways where different orderings of the steps are considered unique.
//

import java.util.Arrays;

public class ClimbingStairs {
	public static void main(String[] args) {
      int n=4;
      int ans=findWays(n);
      
		System.out.println(ans);
		}
	
	static int findWays(int n) {
		
		
		if(n==0 || n==1) {return 1;}
		
			return findWays(n-1)+findWays(n-2);	
			
	}

	
}
