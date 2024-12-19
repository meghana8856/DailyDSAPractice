package DSADailyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int arr[] = { -1, 0, 1, 2, -1, -4 };
		int target = 0;

		List<List<Integer>> ans = getTriplets(arr, target);
//		System.out.print(ans.size());

		for (List<Integer> list : ans) {
			System.out.print("[");

			for (Integer i : list) {
				System.out.print(i + " ");
			}
			System.out.print(" ]");

		}

	}

	private static List<List<Integer>> getTriplets(int[] arr, int target) {
		Arrays.sort(arr);
		List<List<Integer>> ans = new ArrayList<>();
		int j = 0;
		int k = arr.length;
		for (int i = 0; i < arr.length; i++) {

			if (i != 0 && arr[i] == arr[i - 1])
				continue;
			j = i + 1;
			k = arr.length - 1;
			while (j < k) {
				int sum = arr[i] + arr[j] + arr[k];
				if (sum < target) {
					j++;
				} else if (sum > target) {
					k--;
				} else {
					List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k]);
					ans.add(list);
					j++;
					k--;

					while (j < k && arr[j] == arr[j - 1])
						j++;
					while (j < k && arr[k] == arr[k + 1])
						k--;

				}
			}
		}

		return ans;

	}
}
