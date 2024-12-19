package DSADailyPractice;

import java.util.Arrays;

/*You are trying to send signals to aliens using a linear array of A laser lights. You don't know much about how the aliens are going to percieve the signals, but what you know is that if two consecutive lights are on then the aliens might take it as a sign of danger and destroy the earth. 

Find and return the total number of ways in which you can send a signal without compromising the safty of the earth. Return the ans % 109 + 7.
*/
public class WaysToSendSignal_Alien {
	public static void main(String[] args) {
		int n = 3;
		int[] dp = new int[n + 1];
		Arrays.fill(dp, -1);
		System.out.println(sendSignal(n, dp));
	}

	private static int sendSignal(int i, int[] dp) {
		if (i == 1) {
			return 2;
		}
		if (i == 0) {
			return 1;
		}
		if (dp[i] != -1) {
			return dp[i];
		}

		int res = sendSignal(i - 2, dp) + sendSignal(i - 1, dp);
		dp[i] = res;
		return res;
	}
}
