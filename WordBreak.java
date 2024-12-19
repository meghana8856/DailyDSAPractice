package DSADailyPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Asked in paypal
/*Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

 

Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
*/

public class WordBreak {
	public static void main(String[] args) {
	List<String> al =Arrays.asList("man","go","i","like","il","ik","mangoes");
	Set set=new HashSet<>();
	for(String s: al) {
		set.add(s);
	}
	String st="ilikemangoes";
	System.out.println(wordBreak(set,st,0));
	}

	private static boolean wordBreak(Set set,String st,int i) {
		
		if(i==st.length()) {
			return true;
		}
		for(int j=i+1;j<st.length()+1;j++) {
			String prefix=st.substring(i,j);
			System.out.println(prefix);
			if(set.contains(prefix) && wordBreak(set,st,j)){
				return true;
			}
		}
		
		
		return false;
	}
}
