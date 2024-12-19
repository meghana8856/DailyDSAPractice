package DSADailyPractice;
/*Trapping Rainwater Problem states that given an array of n non-negative integers arr[] representing an elevation map where the width of each bar is 1, compute how much water it can trap after rain.
*/

public class RainWaterTrappingProblem {
	public static void main(String[] args) {
		int[] arr = {3, 0, 2, 0, 4 };

		int l = 0;
		int r = arr.length - 1;
		int res = 0;
		int leftMax = 0;
		int rightMax = 0;

		while (l <= r) {

			if (arr[l] <= arr[r]) {
				if (arr[l] >= leftMax) {
					leftMax = arr[l];
				} else {
					res += leftMax - arr[l];
				}
				l++;

			} else if(arr[r] < arr[l]){

				if (arr[r] > rightMax) {
					rightMax = arr[r];
					
				} else {
					res += rightMax - arr[r];
				}
				r--;

			}
		}
		
		System.out.print(res);

	}
}
