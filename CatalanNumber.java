package DSADailyPractice;

/*Given N pairs of brackets ,count number of valid sequence that can be created  -> catalan number
*/
public class CatalanNumber {

	public static void main(String[] args) {
		int n=4;
		
		 System.out.println(catalan(n));
	}

	private static int catalan(int n) {
		if(n==0) {
			return 1;
		}
		
		int ans=0;
		for(int i=0;i<n;i++) {
			ans+= catalan(i) * catalan(n-i-1);
		}
		return ans;
	
		
	}
}
