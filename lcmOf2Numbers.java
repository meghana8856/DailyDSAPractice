package DSADailyPractice;

public class lcmOf2Numbers {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		
		int lcm=(a*b)/gcd(a,b);
		System.out.print(lcm);
	}

	private static int gcd(int a, int b) {

		if(b==0) {
			return a;
		}else {
			return gcd(b,a%b);
		}
	}
}
