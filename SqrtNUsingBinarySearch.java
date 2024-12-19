package DSADailyPractice;

public class SqrtNUsingBinarySearch {
	public static void main(String[] args) {

		int n = 100;

		int l = 1;
		int r = n;

		while (l < r) {
			int mid = (l + r) / 2;

			if (mid * mid == n) {
				System.out.println(mid);
				return;
			} else if (mid * mid <= n) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
	}
}
