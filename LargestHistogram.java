package DSADailyPractice;

import java.util.Stack;

/*Find the largest rectangular area possible in a given histogram where the largest rectangle can be made of a number of contiguous bars whose heights are given in an array. For simplicity, assume that all bars have the same width and the width is 1 unit. 

Example: 

Input: hist = {60, 20, 50, 40, 10, 50, 60}
output : 100*/

public class LargestHistogram {
	public static void main(String[] args) {

		int arr[] = { 3, 0, 1, 0, 4, 0, 2 };

		int[] PrevSmaller = getPreviousSmaller(arr);
		int[] nextSmaller = getNextSmaller(arr);

//		for (int i : nextSmaller) {
//			System.out.print(i + ", ");
//		}
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			
			int width=(nextSmaller[i] - PrevSmaller[i] -1)*arr[i];
			max=Math.max(max, width);
			
		}
		System.out.print(max);


	}

	private static int[] getPreviousSmaller(int[] arr) {
		int k = 0;
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
				st.pop();
			}
			if (st.isEmpty()) {
				ans[k++] = -1;
			} else {
				ans[k++] = st.peek();
			}
			st.push(i);
		}

		return ans;
	}

		private static int[] getNextSmaller(int[] arr) {
			int k = arr.length-1;
			int[] ans = new int[arr.length];
			Stack<Integer> st = new Stack<>();

			for (int i = arr.length -1; i >= 0; i--) {

				while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
					st.pop();
				}
				if (st.isEmpty()) {
					ans[k--] = arr.length;
				} else {
					ans[k--] = st.peek();
				}
				st.push(i);
			}

			return ans;
	}
}
