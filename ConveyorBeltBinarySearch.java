package DSADailyPractice;

/*
11. A conveyor belt has packages that must be shipped from one port to another within days days.
The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt 
(in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

Example 1:

Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10*/

public class ConveyorBeltBinarySearch {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int days = 5;
		int sum = 0;
		int l = arr[0];
		for (int i = 1; i < arr.length; i++) {
			l = Math.max(l, arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int r = sum;
		int mid = 0;
		int ans = 0;

		while (l <= r) {
			mid = (l + r) / 2;
			if (leastWeight(mid, arr, days)) {
				ans = mid;
				r = mid - 1;
			} else {
				l = mid + 1;

			}
		}
		System.out.println(ans);

	}

	private static boolean leastWeight(int mid, int[] arr, int days) {

		int cntDays = 1;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			if (sum + arr[i] > mid) {
				sum = arr[i];
				cntDays++;
				if (cntDays > days) {
					return false;
				}
			} else {
				sum += arr[i];
			}
		}
//		if (cntDays >= days) {
//			return true;
//		}

		return true;
	}
}
