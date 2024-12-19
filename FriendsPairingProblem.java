package DSADailyPractice;


/*Given n friends, each one can remain single or can be paired up with some other friend.
 *  Each friend can be paired only once.
 *   Find out the total number of ways in which friends can remain single or can be paired up. 
 *   Input  : n = 3
     Output : 4
*/
import java.util.Arrays;

public class FriendsPairingProblem {
	public static void main(String[] args) {
        
        int n=3;
        int[] dp =new int[n+1];
        Arrays.fill(dp, -1);
		int ans = pair(n,dp);
		System.out.println(ans);
		}

		private static int  pair(int n,int[] dp) {
			
			if (dp[n] != -1)
	            return dp[n];
	 
			if(n>2) {
				return dp[n]=pair(n-1,dp)+((n-1) * pair(n-2,dp));
			}else {
				return dp[n]=n;	
			}
			
			
			
		}

}
