package DSADailyPractice;

import java.util.Arrays;

/*Given an array of positive numbers. Find the maximum length k such that there is no subarray of length k with sum>=B
*/

public class MaximumSubarrayBinarySearch {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int B = 10;
		int l = 0;
		int r = arr.length - 1;
		int mid = 0;

		int ans = 0;

		while (l <= r) {
			mid = (l + r) / 2;

			if (isMaximumArrayPOssible(arr, mid, B)) {
				ans = mid;
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		System.out.println(ans);

	}

	private static boolean isMaximumArrayPOssible(int[] arr, int k, int B) {
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		if (sum >= B) {
			return false;
		}
		for (int i = k; i < arr.length; i++) {
			sum += arr[i] - arr[i - k];
			if (sum >= B) {
				return false;
			}

		}

		return true;
	}
}
