package DSADailyPractice;

import java.util.Arrays;

/*Given an array arr[0 .. n-1] of distinct integers, the task is to find a local minimum in it. We say that an element arr[x] is a local minimum if it is less than both its neighbors. 

For corner elements, we need to consider only one neighbor for comparison.
There can be more than one local minima in an array, we need to find one of them.
Examples: 

Input: arr[] = {9, 6, 3, 14, 5, 7, 4};
Output: Index of local minima is 2*/

public class LocalMinima {
	public static void main(String[] args) {

		int arr[] = {3, 2, 1};

		int l = 0;
		int r = arr.length - 1;
		int mid = 0;

		int n = arr.length;
		if (n == 1 || arr[0] < arr[1]) {
			System.out.println(0);
			return;// Single element or first element is a local minima
		}
		if (arr[n - 1] < arr[n - 2]) {
			System.out.println(n - 1);
			return; // Last element is a local minima
		}

		while (l < r) {
			mid = (l + r) / 2;
			if ((mid == 0 || arr[mid] < arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] < arr[mid + 1])) {
				System.out.println(mid);
				return;
			}

			if (arr[mid] > arr[mid - 1]) {
				r = mid;
			} else if (arr[mid] > arr[mid + 1]) {
				l = mid;
			}
		}

//        System.out.println("The single element is: " + arr[l]);

	}
}
