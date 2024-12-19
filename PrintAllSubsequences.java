package DSADailyPractice;

public class PrintAllSubsequences {
	public static void main(String[] args) {
		String s = "abc";

		solve(s, 0, "");
	}

	private static void solve(String s, int i, String st) {

		if (i >= s.length()) {
			System.out.println(st);
			return;
		}

		solve(s, i + 1, st + s.charAt(i));
		solve(s, i + 1, st);

	}
}
