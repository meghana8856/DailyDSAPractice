package DSADailyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		int[] arr = { 1, 0, -1, 0, -2, 2 };
		int target = 0;
		List<List<Integer>> list = getQuads(arr, target);
		for (List<Integer> ans : list) {
			System.out.print("[");
			for (Integer i : ans) {
				System.out.print(i + ",");
			}
			System.out.print("]");

		}

	}

	private static List<List<Integer>> getQuads(int[] arr, int target) {
		Arrays.sort(arr);
		List<List<Integer>> ans = new ArrayList<>();
		int k = 0;

		int m = arr.length - 1;

		for (int i = 0; i < arr.length; i++) {

			if (i >0 && arr[i] == arr[i - 1])
				continue;

			for (int j = i + 1; j < arr.length; j++) {

				if (j <i+1  && arr[j] == arr[j - 1])
					continue;
				k = j + 1;
				m = arr.length - 1;
				while (k < m) {
					long sum = arr[i];
                    sum += arr[j];
                    sum += arr[k];
                    sum += arr[m];

					if (sum < target) {
						k++;
					} else if (sum > target) {
						m--;
					} else {
						
						List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k], arr[m]);
						ans.add(list);
						k++;
						m--;

						while (k < m && arr[k] == arr[k - 1])
							k++;
						while (k < m && arr[m] == arr[k + 1])
							m--;

					}

				}

			}

		}
		return ans;
	}
}
