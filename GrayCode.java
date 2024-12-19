package DSADailyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Calculate Gray code for given N
*/
public class GrayCode {
	public static void main(String[] args) {
		int N = 4;

		List<String> ans = grayCode(N);
		for (String s : ans) {
			System.out.println(s);
		}

	}

	private static List<String> grayCode(int n) {

		if (n == 0) {
			return null;
		}
		if (n == 1) {
			return Arrays.asList("0", "1");
		}

		List<String> ans = grayCode(n - 1);
		List<String> list = new ArrayList<>();
		for (int i = 0; i < ans.size(); i++) {
			list.add("0" + ans.get(i));
		}
		for (int i = ans.size() - 1; i >= 0; i--) {
			list.add("1" + ans.get(i));
		}

		return list;
	}
}
