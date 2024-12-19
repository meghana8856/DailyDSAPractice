package DSADailyPractice;

import java.util.Arrays;

public class AggressiveCows {
	public static void main(String[] args) {

		int[] stalls = { 6 ,7 ,9 ,11, 13, 15};
		int k = 4;

		Arrays.sort(stalls);
		int low = 1;
		int high = stalls[stalls.length - 1] - stalls[0];
		int mid = 0;
int ans=0;
		System.out.println("high is " + high);
		while (low <= high) {
			mid = (low + high) / 2;
			System.out.println("mid is " + mid);
			if (isPossibleToplaceCows(mid, stalls, k)) {
				ans=mid;
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

		System.out.println(ans);

	}

	private static boolean isPossibleToplaceCows(int mid, int[] stalls, int k) {
		int count = 1;
        int prev= stalls[0];
		for (int i = 1; i < stalls.length; i++) {

			if (stalls[i]-prev >= mid) {
				count++;
				prev=stalls[i];
			}
			if (count >= k) {
				return true;
			}
		}

		return false;
	}

}
