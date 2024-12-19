package DSADailyPractice;

/*A positive integer is magical if it is divisible by either a or b.

Given the three integers n, a, and b, return the nth magical number. Since the answer may be very large, return it modulo 109 + 7.

 

Example 1:

Input: n = 1, a = 2, b = 3
Output: 2
Example 2:

Input: n = 4, a = 2, b = 3
Output: 6*/

public class NthMagicalNumber {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int n = 4;

		int l = 0;
		int r = n * Math.min(a, b);
		int ans = 0;
        long mod = 1000000007;

		while (l < r)

		{
			int mid = l + ((r-l) / 2);

			if (countDigits(mid, a, b) < n) {
				l=mid+1;
			} else {
				r=mid;
			}

		}
		System.out.print(l%mod);
	}

	private static int countDigits(int mid, int a2, int b2) {
		return (mid / a2) + (mid / b2) - (mid / lcm(a2, b2));
	}

	private static int lcm(int a2, int b2) {
		return (a2 * b2) / gcd(a2, b2);
	}

	private static int gcd(int a2, int b2) {
		if (b2 == 0) {
			return a2;
		} else {
			return gcd(b2, a2 % b2);
		}
	}

}
