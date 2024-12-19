package DSADailyPractice;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubSequence {
	public static void main(String[] args) {

		int arr[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
		List<Integer> res=new ArrayList<Integer>();
		System.out.println(solve(arr, 0, -1,new ArrayList<Integer>(),res));
		
//		for(Integer i:res) {
//			System.out.println(i);
//		}
	}

	private static int solve(int[] arr, int ind, int prev,List<Integer> list,List<Integer> result) {

		if (ind == arr.length) {
			return 0;
		}

		int noPick = solve(arr, ind + 1, prev, new ArrayList<>(list),result);
		int pick = 0;
		if (prev == -1 || arr[ind] > arr[prev]) {
			list.add(arr[ind]);
			pick = 1 + solve(arr, ind + 1, ind, new ArrayList<>(list),result);
		}
		
		if(pick>noPick) {
			result.clear();
			result.addAll(list);
		}
		return Math.max(noPick, pick);
	}
}
