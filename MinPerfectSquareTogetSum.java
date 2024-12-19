package DSADailyPractice;


/*Given a positive integer n, the task is to find the minimum number of squares that sum to n.

Note: A number can always be represented as a sum of squares of other numbers. Because 1 is a square number and we can always break any number as (1*1 + 1*1 + 1*1 + … ).

Examples : 

Input:  n = 100
Output: 1
Explanation: 100 can be written as [ 102 ] or [ 52 + 52 + 52 + 52 ] and the smallest square numbers needed is 1, in case [ 102 ].
*/
import java.util.Arrays;

public class MinPerfectSquareTogetSum {
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
