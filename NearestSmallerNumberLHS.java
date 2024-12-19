package DSADailyPractice;

import java.util.Stack;

/*Given an array of positive Integers. For every index i find the nearest element  on right side of i which is smaller than arr[i]
Input:  arr[] = {1, 6, 4, 10, 2, 5}
Output:         {_, 1, 1,  4, 1, 2}
First element (‘1’) has no element on left side. For 6, there is only one smaller element on left side ‘1’.  For 10, there are three smaller elements on left side (1, 6 and 4), nearest among the three elements is 4.
*/
public class NearestSmallerNumberLHS {
  public static void main(String[] args) {
	  int[] arr= {1, 6, 4, 10, 2, 5};
	  int[] ans=new int[arr.length];
	  int k=arr.length-1;
	  
	  Stack<Integer> st=new Stack<>();
	  
	  for(int i=arr.length-1;i>=0;i--) {
		  
		  while(!st.isEmpty() && st.peek() > arr[i]) {
			  st.pop();
		  }
		  if(st.isEmpty()) {
			  ans[k--]=-1;
		  } else {
			  ans[k--]=st.peek();
		  }
		  st.push(arr[i]);
	  }
	  
	 
	  for(int i: ans) {
		  System.out.print(i+", ");
	  }
  }
}
