package DSADailyPractice;

//You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
//
//Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
//
//0 <= j <= nums[i] and
//i + j < n
//Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].

 
import java.util.Arrays;

public class JumpGame2 {
	public static void main(String[] args) {
		int[] arr= {2,3,1,1,4};
		int dp[] = new int[arr.length];
			Arrays.fill(dp, -1);
	
		int ans = minjumps(arr,arr.length-1,dp);

		System.out.println(ans);
	}

	   static int minjumps(int[] arr, int end, int[] dp) {
	        if (end == 0) {
	            return 0;
	        }
	        if (dp[end] != -1) {
	            return dp[end];
	        }
	        int minjumps = Integer.MAX_VALUE;
	        for (int i = 0; i < end; i++) {
	            if (i + arr[i] >= end) {
	                int jumps = minjumps(arr, i, dp);
	                minjumps = Math.min(jumps + 1, minjumps);
	                dp[end] = minjumps;
	                return minjumps;
	            }
	        }

	        return minjumps;
	    }

}
