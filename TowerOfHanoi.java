package DSADailyPractice;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int n = 3;
		int count = 0;
		System.out.println(toh(n, "A", "B", "C", 0));
	}

	private static int toh(int n, String src, String temp, String dest, int count) {

		if (n == 0) {
			return count;
		}

		count = toh(n - 1, src, dest, temp, count);
		count++;
		System.out.println(src + "  ---->  " + dest);
		return count = toh(n - 1, temp, src, dest, count);

	}
}
