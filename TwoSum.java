package DSADailyPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = { 2, 9, 5, 8, 3 };
		int sum = 5;
		int[] ans = new int[2];
//		Map<Integer,Integer> map=new HashMap<>();
//		for(int i=0;i<arr.length;i++) {
//			
//			if(map.containsKey(sum-arr[i])) {
//				 ans[0]=i;
//				 ans[1]=map.get(sum-arr[i]);
//				 System.out.print(ans[0]+" ");
//				 System.out.print(ans[1]);
//				 return;
//			}
//			
//			map.put(arr[i], i);
//			
//		}
		Arrays.sort(arr);
		int l = 0;
		int r = arr.length - 1;

		while (l < r) {
			int sum1 = arr[l] + arr[r];

			if (sum1 == sum) {
				System.out.print("Yes");
				return;
			} else if (sum1 < sum) {
				l++;
			} else {
				r--;
			}
		}

	}
}
