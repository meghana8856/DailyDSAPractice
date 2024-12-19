package DSADailyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartitioning2 {
    public static void main(String[] args) {
        String s = "aabb";
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        
        List<List<String>> ans = new ArrayList<>();
        
        partitioning(s, 0, dp, new ArrayList<>(), ans);
        
        System.out.println("List of palindromic substrings: ");

        
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < ans.get(i).size(); j++) {
                System.out.print(ans.get(i).get(j) + " ");
            }
            System.out.print("] ");
        }
    }

    static void partitioning(String st,int index,int[] dp,List<String> currentList,List<List<String>> ans){
    	
    	
    	if(index==st.length()) {
            ans.add(new ArrayList < > (currentList));
    		return;
    	}
    	
    	
    	//for minimum cuts problem int min=Integer.MAX_VALUE;
    	for(int i=index;i<st.length();i++) {
    		if(isPalindrome(st, index, i)) {
    			currentList.add(st.substring(index,i+1));
//				min= Math.min( min, (i == st.length() - 1) ? 0 : 1 + partitioning(st, i + 1, dp));
    			partitioning(st, index+1, dp, currentList, ans);
    			currentList.remove(currentList.size()-1);
    		}
    	}
    }
    static boolean isPalindrome(String st, int start, int end) {
        while (start <= end) {
            if (st.charAt(start++) != st.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
