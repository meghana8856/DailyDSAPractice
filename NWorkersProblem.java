package DSADailyPractice;

/*Given N task and K workers.Given an array A[i] where i is the time taken to complete ith task. Find the minimum time to complete all task
*/

public class NWorkersProblem {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7};
		int k = 7;
		int l = arr[0];
		for (int i = 0; i < arr.length; i++) {
			l = Math.max(l, arr[i]);
		}
		int r = 0;
		int ans = 0;
		for (int i = 0; i < arr.length; i++) {
			r += arr[i];
		}

		while (l <= r) {
			int mid = (l + r) / 2;

			if (isCheck(mid, arr, k)) {
				ans = mid;
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		System.out.println(ans);

	}

	private static boolean isCheck(int mid, int[] arr, int k) {
		int cntDays = 1;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (sum + arr[i] > mid) {
				cntDays++;
				sum = arr[i];
				if (cntDays > k) {
					return false;
				}
			} else {
				sum += arr[i];
			}
		}

		return true;
	}

}
