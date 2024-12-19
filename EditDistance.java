package DSADailyPractice;

//Edit distance(convert s1 to s2 and return minimum cost of conversion)

import java.util.Arrays;

public class EditDistance {
	public static void main(String[] args) {
		String s1 = "horse";
		String s2 = "ros";
		int dp[][] = new int[s1.length()][s2.length()];
		for (int[] i : dp) {
			Arrays.fill(i, -1);
		}
		int ans = cost(s1, s2, s1.length()-1, s2.length()-1,1,1,1);

		System.out.println(ans);
	}

	private static int cost(String s1, String s2, int i, int j,int insert,int update,int delete) {

		if(i<0 && j<0 ) {
			return 0;
		}
		
		if(i<0) {
			return (j+1) * insert;
		}
		
		if(j<0) {
			return (i+1) * delete;
		}
		
		if(s1.charAt(i)==s2.charAt(j)) {
			return cost(s1,s2,i-1,j-1,insert,update,delete);
		} else {
			int insertCost=cost(s1,s2,i,j-1,insert,update,delete);
			int deleteCost=cost(s1,s2,i-1,j,insert,update,delete);
			int updateCost=cost(s1,s2,i-1,j-1,insert,update,delete);
			return 1 + Math.min(insertCost, Math.min(deleteCost, updateCost));
		}

	}

}
